package com.zhanglin.networkSlicingBackend.ms.service.impl;

import com.zhanglin.networkSlicingBackend.ms.exception.MyException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
@Slf4j
@ConfigurationProperties
public class RyuRestService {

    @Value("${ryu.ryuRestUrl}")
    private String RYURESTURL;

    @Autowired
    private RestTemplate restTemplate;


    //        {
    //            "1": [
    //            {
    //                "length": 88,
    //                    "table_id": 0,
    //                    "duration_sec": 2,
    //                    "duration_nsec": 6.76e+08,
    //                    "priority": 11111,
    //                    "idle_timeout": 0,
    //                    "hard_timeout": 0,
    //                    "flags": 1,
    //                    "cookie": 1,
    //                    "packet_count": 0,
    //                    "byte_count": 0,
    //                    "match": {
    //                "in_port": 1
    //            },
    //                "actions": [
    //                "OUTPUT:2"
    //          ]
    //            }
    //      ]
    //        }
    public String getFlowTable(String dpid) {
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/stats/flow/" + dpid)
                .toUriString();
        log.info("@requestUrl: " + requestURI);
        String responseBody = null;
        try {
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
            ResponseEntity<String> response = restTemplate.exchange(requestURI, HttpMethod.GET, requestEntity, String.class);
            responseBody  = response.getBody();
        } catch (Exception e) {
            log.info("Failed to get flow table: {}", e.getMessage());
        }
        return responseBody;
    }


    //{
    //  "1": [
    //    {
    //      "port_no": 1,
    //      "rx_packets": 9,
    //      "tx_packets": 6,
    //      "rx_bytes": 738,
    //      "tx_bytes": 252,
    //      "rx_dropped": 0,
    //      "tx_dropped": 0,
    //      "rx_errors": 0,
    //      "tx_errors": 0,
    //      "rx_frame_err": 0,
    //      "rx_over_err": 0,
    //      "rx_crc_err": 0,
    //      "collisions": 0,
    //      "duration_sec": 12,
    //      "duration_nsec": 9.76e+08
    //    },
    //    {
    //      :
    //      :
    //    }
    //  ]
    //}
    public String getPortStats(String dpid){
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/stats/port/" + dpid)
                .toUriString();
        log.info("@requestUrl: " + requestURI);
        String responseBody = null;
        try {
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
            ResponseEntity<String> response = restTemplate.exchange(requestURI, HttpMethod.GET, requestEntity, String.class);
            responseBody  = response.getBody();
        } catch (Exception e) {
            log.info("Failed to get flow table: {}", e.getMessage());
        }
        return responseBody;
    }

    //$ curl -X POST -d '{
    //    "dpid": 1,
    //    "cookie": 1,
    //    "cookie_mask": 1,
    //    "table_id": 0,
    //    "idle_timeout": 30,
    //    "hard_timeout": 30,
    //    "priority": 11111,
    //    "flags": 1,
    //    "match":{
    //        "in_port":1
    //    },
    //    "actions":[
    //        {
    //            "type":"OUTPUT",
    //            "port": 2
    //        }
    //    ]
    // }' http://localhost:8080/stats/flowentry/add
    public String addFlowEntry(String body){
        String add_flow_url = "%s/stats/flowentry/add" ;

        //return req.status_code
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/stats/flowentry/add").toUriString();
        log.info("@requestUrl: " + requestURI);
        String responseBody = null;
        try {
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<String> requestEntity = new HttpEntity<String>(body, requestHeaders);
            ResponseEntity<String> response = restTemplate.exchange(requestURI, HttpMethod.GET, requestEntity, String.class);
            responseBody  = response.getBody();
        } catch (Exception e) {
            log.info("Failed to get flow table: {}", e.getMessage());
        }
        return responseBody;

    }


    public String del_flow(String req_data){
        //return req.status_code;
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/stats/flowentry/delete" )
                .toUriString();
        log.info("@requestUrl: " + requestURI);
        return null;
    }


   // get_topology

    public String getSwitches(){
        // /stats/switches
//        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/v1.0/topology/switches" )
//                .toUriString();\
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/stats/switches" )
                .toUriString();
        //response: [1,2,3,4,5,6]
        log.info("@requestUrl: " + requestURI);
        String responseBody = null;
        try {
            HttpHeaders requestHeaders = new HttpHeaders();
            //requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
            ResponseEntity<String> response = restTemplate.exchange(requestURI, HttpMethod.GET, requestEntity, String.class);
            responseBody  = response.getBody();
            log.info(response.getBody());


        } catch (Exception e) {
            e.printStackTrace();
            log.info("Failed to get switches: {}", e.getMessage());
        }
        return responseBody;
    }
    public String getLinks(){
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/v1.0/topology/links" )
                .toUriString();
        log.info("@requestUrl: " + requestURI);
        String responseBody = null;
        try {
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
            ResponseEntity<String> response = restTemplate.exchange(requestURI, HttpMethod.GET, requestEntity, String.class);
            responseBody  = response.getBody();
        } catch (Exception e) {
            log.info("Failed to get flow table: {}", e.getMessage());
        }
        return responseBody;
    }


    private String portAndFlow(String dpid){
//        port_url = base_url + '/v1.0/topology/switches/' + dpid
//        port_json = urllib2.urlopen(urllib2.Request(port_url)).read()
//        port_dict = (json.loads(port_json))[0]['ports']
//
//        portbw_url = base_url + '/stats/port/' + str(int(dpid,16))
//        portbw_json = urllib2.urlopen(urllib2.Request(portbw_url)).read()
//        portbw_dict = json.loads(portbw_json)
//
//        flow_url = base_url + '/stats/flow/' +  str(int(dpid,16))
//        flow_json = urllib2.urlopen(urllib2.Request(flow_url)).read()
//        flow_dict = json.loads(flow_json)
//        portAndflow = {'port_dict': port_dict, 'portbw_dict': portbw_dict, 'flow_dict': flow_dict}
//        return render_template('portAndFlow.html', portAndflow=portAndflow)
        return null;
    }


    public String getHost(){
        String requestURI = UriComponentsBuilder.fromUriString(RYURESTURL + "/v1.0/topology/hosts")
                .toUriString();
        log.info("@requestUrl: " + requestURI);
        String responseBody = null;
        try {
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
            ResponseEntity<String> response = restTemplate.exchange(requestURI, HttpMethod.GET, requestEntity, String.class);
            responseBody  = response.getBody();
        } catch (Exception e) {
            log.info("Failed to get flow table: {}", e.getMessage());
        }
        return responseBody;

    }












    /**
     * below are official document
     */


    //Get the list of all switches which connected to the controller.
    private List getAllSwitches(){
        // curl -X GET http://localhost:8080/stats/switches
        String get_switch_list_url = "/stats/switches";
        return null;
    }



    //Get the desc stats of the switch which specified with Datapath ID in URI.
    //$ curl -X GET http://localhost:8080/stats/desc/1
    ////    {
    ////        "1": {
    ////        "mfr_desc": "Nicira, Inc.",
    ////                "hw_desc": "Open vSwitch",
    ////                "sw_desc": "2.3.90",
    ////                "serial_num": "None",
    ////                "dp_desc": "None"
    ////    }
    ////    }
    private void getSwitchDesc(String dpid){
        List<String> list = getAllSwitches();
        for (int i = 0;i < list.size();i++){
            String get_switch_desc_url = "/stats/desc/" + dpid;
        }

    }


    //Get all flows stats of the switch which specified with Datapath ID in URI.
    //$ curl -X GET http://localhost:8080/stats/flow/1
    //        {
    //            "1": [
    //            {
    //                "length": 88,
    //                    "table_id": 0,
    //                    "duration_sec": 2,
    //                    "duration_nsec": 6.76e+08,
    //                    "priority": 11111,
    //                    "idle_timeout": 0,
    //                    "hard_timeout": 0,
    //                    "flags": 1,
    //                    "cookie": 1,
    //                    "packet_count": 0,
    //                    "byte_count": 0,
    //                    "match": {
    //                "in_port": 1
    //            },
    //                "actions": [
    //                "OUTPUT:2"
    //          ]
    //            }
    //      ]
    //        }
    private String getAllFlowStats(String dpid) {
        String get_flow_Stat_url = "/stats/flow/%s" ;
        return null;

    }

    //Get flows stats of the switch filtered by the OFPFlowStats fields. This is POST method version of Get all flows stats.
    //    $ curl -X POST -d '{
    //            "table_id": 0,
    //            "out_port": 2,
    //            "cookie": 1,
    //            "cookie_mask": 1,
    //            "match":{
    //        "in_port":1
    //    }
    //}' http://localhost:8080/stats/flow/1
    private String getFlowStats(String dpid) {
        String get_flow_Stat_url = "/stats/flow/%s" ;
        return null;

    }




    //Get aggregate flow stats of the switch which specified with Datapath ID in URI.
    ///$ curl -X GET http://localhost:8080/stats/aggregateflow/1
    //{
    //        "1": [
    //        {
    //            "packet_count": 18,
    //                "byte_count": 756,
    //                "flow_count": 3
    //        }
    //  ]
    //    }
    public String getAggregateFlowStats(String dpid){
        return null;

    }

    // Get aggregate flow stats of the switch filtered by the OFPAggregateStats fields. This is POST method version of Get aggregate flow stats.
    //$ curl -X POST -d '{
    //     "table_id": 0,
    //     "out_port": 2,
    //     "cookie": 1,
    //     "cookie_mask": 1,
    //     "match":{
    //         "in_port":1
    //     }
    // }' http://localhost:8080/stats/aggregateflow/1

    //{
    //  "1": [
    //    {
    //      "packet_count": 18,
    //      "byte_count": 756,
    //      "flow_count": 3
    //    }
    //  ]
    //}
    public String getAggregateFlowStatsByFields(String dpid){
        return null;

    }


    //Get table stats of the switch which specified with Datapath ID in URI.
    //$ curl -X GET http://localhost:8080/stats/table/1
    //{
    //  "1": [
    //    {
    //      "active_count": 0,
    //      "table_id": 0,
    //      "lookup_count": 8,
    //      "matched_count": 0
    //    },
    //    ...
    //    {
    //      "active_count": 0,
    //      "table_id": 253,
    //      "lookup_count": 0,
    //      "matched_count": 0
    //    }
    //  ]
    //}
    public String getTableStats() {
        String get_flow_table_url = "/stats/table/%s" ;
        return null;

    }

    //Get table features of the switch which specified with Datapath ID in URI.
    //$ curl -X GET http://localhost:8080/stats/tablefeatures/1
    //{
    //  "1": [
    //    {
    //      "metadata_write": 18446744073709552000,
    //      "config": 0,
    //      "table_id": 0,
    //      "metadata_match": 18446744073709552000,
    //      "max_entries": 4096,
    //      "properties": [
    //        {
    //          "type": "INSTRUCTIONS",
    //          "instruction_ids": [
    //           {
    //           "len": 4,
    //           "type": 1
    //           },
    //           ...
    //          ]
    //        },
    //        ...
    //      ],
    //      "name": "table_0"
    //    },
    //    {
    //      "metadata_write": 18446744073709552000,
    //      "config": 0,
    //      "table_id": 1,
    //      "metadata_match": 18446744073709552000,
    //      "max_entries": 4096,
    //      "properties": [
    //        {
    //          "type": "INSTRUCTIONS",
    //          "instruction_ids": [
    //           {
    //           "len": 4,
    //           "type": 1
    //           },
    //           ...
    //          ]
    //        },
    //        ...
    //      ],
    //      "name": "table_1"
    //    },
    //    ...
    //  ]
    //}
    public String getTableFeatures(String dpid) {
        String get_flow_table_url = "stats/tablefeatures/%s" ;
        return null;

    }


    //Get ports stats of the switch which specified with Datapath ID in URI.
    //$ curl -X GET http://localhost:8080/stats/port/1
    //{
    //  "1": [
    //    {
    //      "port_no": 1,
    //      "rx_packets": 9,
    //      "tx_packets": 6,
    //      "rx_bytes": 738,
    //      "tx_bytes": 252,
    //      "rx_dropped": 0,
    //      "tx_dropped": 0,
    //      "rx_errors": 0,
    //      "tx_errors": 0,
    //      "rx_frame_err": 0,
    //      "rx_over_err": 0,
    //      "rx_crc_err": 0,
    //      "collisions": 0,
    //      "duration_sec": 12,
    //      "duration_nsec": 9.76e+08
    //    },
    //    {
    //      :
    //      :
    //    }
    //  ]
    //}
    public String getPortStats0(String dpid) {
        String get_flow_table_url = "/stats/port/" ;
        return null;

    }

    //Get ports description of the switch which specified with Datapath ID in URI.
    //$ curl -X GET http://localhost:8080/stats/portdesc/1
    //  "1": [
    //    {
    //      "port_no": 1,
    //      "hw_addr": "0a:b6:d0:0c:e1:d7",
    //      "name": "s1-eth1",
    //      "config": 0,
    //      "state": 0,
    //      "curr": 2112,
    //      "advertised": 0,
    //      "supported": 0,
    //      "peer": 0,
    //      "curr_speed": 1e+07,
    //      "max_speed": 0
    //    },
    //    {
    //      :
    //      :
    //    }
    //  ]
    //}
    public String getPortsDescription(String dpid){
        return null;
    }


    //Get queues stats of the switch which specified with Datapath ID in URI.

    //Get queues config of the switch which specified with Datapath ID and Port in URI.

    //Get queues description of the switch which specified with Datapath ID, Port and Queue_id in URI.

    //Get group description stats of the switch which specified with Datapath ID in URI.

    //Get group features stats of the switch which specified with Datapath ID in URI.

    //Get meters stats of the switch which specified with Datapath ID in URI.

    //Get meter config stats of the switch which specified with Datapath ID in URI.

    //Get the current role of the controller from the switch.


    //Add a flow entry to the switch.
    //$ curl -X POST -d '{
    //    "dpid": 1,
    //    "cookie": 1,
    //    "cookie_mask": 1,
    //    "table_id": 0,
    //    "idle_timeout": 30,
    //    "hard_timeout": 30,
    //    "priority": 11111,
    //    "flags": 1,
    //    "match":{
    //        "in_port":1
    //    },
    //    "actions":[
    //        {
    //            "type":"OUTPUT",
    //            "port": 2
    //        }
    //    ]
    // }' http://localhost:8080/stats/flowentry/add

    //$ curl -X POST -d '{
    //    "dpid": 1,
    //    "priority": 22222,
    //    "match":{
    //        "in_port":1
    //    },
    //    "actions":[
    //        {
    //            "type":"GOTO_TABLE",
    //            "table_id": 1
    //        }
    //    ]
    // }' http://localhost:8080/stats/flowentry/add
    public String addAFlowEntry() {
        String get_flow_table_url = "/stats/flowentry/add" ;
        return null;

    }

    //Modify all matching flow entries of the switch.
    //$ curl -X POST -d '{
    //    "dpid": 1,
    //    "cookie": 1,
    //    "cookie_mask": 1,
    //    "table_id": 0,
    //    "idle_timeout": 30,
    //    "hard_timeout": 30,
    //    "priority": 11111,
    //    "flags": 1,
    //    "match":{
    //        "in_port":1
    //    },
    //    "actions":[
    //        {
    //            "type":"OUTPUT",
    //            "port": 2
    //        }
    //    ]
    // }' http://localhost:8080/stats/flowentry/modify




    //Delete all flow entries of the switch which specified with Datapath ID in URI.
    //$ curl -X DELETE http://localhost:8080/stats/flowentry/clear/1\
    public String deleteAllFlowEntries() {
        String get_flow_table_url = "/stats/flowentry/clear/%s" ;
        return null;

    }


    //Add a group entry to the switch.

    //Modify a group entry to the switch.

    //Modify the behavior of the physical port.

    //Add a meter entry to the switch.

    //modify the role of the switch.
    //$ curl -X POST -d '{
    //    "dpid": 1,
    //    "role": "MASTER"
    // }' http://localhost:8080/stats/role



    //To match only packets with VLAN tag and VLAN ID equal value 5:
    //
    //$ curl -X POST -d '{
    //    "dpid": 1,
    //    "match":{
    //        "dl_vlan": 5
    //    },
    //    "actions":[
    //        {
    //            "type":"OUTPUT",
    //            "port": 1
    //        }
    //    ]
    // }' http://localhost:8080/stats/flowentry/add




}
