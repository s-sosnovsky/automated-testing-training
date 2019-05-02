package model;

public class Order {

    private  String cloudEngine;
    private  String numberOfInstances;
    private  String operationSystemType;
    private  String vmClassType;
    private  String instanceType;
    private  String localSsdType;
    private  String numberOfGpu;
    private  String gpuType;
    private  String datacenterLocation;
    private  String commitmentTerm;

    public Order(){}

    public Order( String cloudEngine, String numberOfInstances, String operationSystemType, String vmClassType,
                 String instanceType, String localSsdType, String numberOfGpu, String gpuType,
                 String datacenterLocation, String commitmentTerm) {
        this.cloudEngine = cloudEngine;
        this.numberOfInstances = numberOfInstances;
        this.operationSystemType = operationSystemType;
        this.vmClassType = vmClassType;
        this.instanceType = instanceType;
        this.localSsdType = localSsdType;
        this.numberOfGpu = numberOfGpu;
        this.gpuType = gpuType;
        this.datacenterLocation = datacenterLocation;
        this.commitmentTerm = commitmentTerm;
    }

    public String getCloudEngine() {
        return cloudEngine;
    }



    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getOperationSystemType() {
        return operationSystemType;
    }

    public String getVmClassType() {
        return vmClassType;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public String getLocalSsdType() {
        return localSsdType;
    }

    public String getNumberOfGpu() {
        return numberOfGpu;
    }

    public String getGpuType() {
        return gpuType;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public String getCommitmentTerm() {
        return commitmentTerm;
    }

    public void setCloudEngine(String cloudEngine) {
        this.cloudEngine = cloudEngine;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public void setOperationSystemType(String operationSystemType) {
        this.operationSystemType = operationSystemType;
    }

    public void setVmClassType(String vmClassType) {
        this.vmClassType = vmClassType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public void setLocalSsdType(String localSsdType) {
        this.localSsdType = localSsdType;
    }

    public void setNumberOfGpu(String numberOfGpu) {
        this.numberOfGpu = numberOfGpu;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    public void setCommitmentTerm(String commitmentTerm) {
        this.commitmentTerm = commitmentTerm;
    }


}
