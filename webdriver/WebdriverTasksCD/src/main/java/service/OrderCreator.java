package service;

import model.Order;

public class OrderCreator {

    private final static String CLOUD_ENGINE = "Compute Engine";
    private final static String NUMBER_OF_INSTANCES = "4";
    private final static String OPERATION_SYSTEM_TYPE = "Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS";
    private final static String VM_CLASS_VALUE ="Regular";
    private final static String INSTANCE_TYPE = "n1-standard-8    (vCPUs: 8, RAM: 30 GB)";
    private final static String LOCAL_SSD="2x375 GB";
    private final static String NUMBER_OF_GPU = "1";
    private final static String GPU_TYPE = "NVIDIA Tesla P100";
    private final static String DATACENTER_LOCATION = "Frankfurt (europe-west3)";
    private final static String COMMITMENT_TERM = "1 Year";


    public static Order getSimpleInstanceOrder(){
        return new Order(CLOUD_ENGINE, NUMBER_OF_INSTANCES, OPERATION_SYSTEM_TYPE, VM_CLASS_VALUE,
                INSTANCE_TYPE, LOCAL_SSD, NUMBER_OF_GPU, GPU_TYPE, DATACENTER_LOCATION, COMMITMENT_TERM);
    }
}
