package com.jianglei.c15_builder.v04_insurance_contract;

/**
 * Created by jianglei on 17-7-10.
 */
public class InsuranceContract {
    //合同编号
    private String contractId;

    //被保险人员的名称，同一份保险合同，要么跟人签订，要么跟公司签订
    //也就是说，“被保险人员”和“被保险公司”这两个属性，不可能同时有值
    private String personName;

    private String companyName;

    private long beginDate;

    private long endDate;

    private String otherData;

    public InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.comanyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }

    public void someOperation() {
        System.out.println("当前正在操作的保险合同编号为[" + contractId + "]");
    }

    @Override
    public String toString() {
        return "InsuranceContract{" +
                "contractId='" + contractId + '\'' +
                ", personName='" + personName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", otherData='" + otherData + '\'' +
                '}';
    }

    public static class ConcreteBuilder{

        private String contractId;

        private String personName;

        private String comanyName;

        private long beginDate;

        private long endDate;

        private String otherData;

        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;

            return this;
        }

        public ConcreteBuilder setCompanyName(String comanyName) {
            this.comanyName = comanyName;

            return this;
        }


        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;

            return this;
        }

        public InsuranceContract build() {
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }

            boolean signPerson = (personName != null && personName.trim().length() > 0);
            boolean signCompany = (comanyName != null && comanyName.trim().length() > 0);

            if (signPerson && signCompany) {
                throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");
            }

            if (!signPerson && !signCompany) {
                throw new IllegalArgumentException("一份𡥀保险合同不能没有签象??  ");
            }

            if (beginDate <= 0) {
                throw new IllegalArgumentException();
            }

            if (endDate <= 0) {
                throw new IllegalArgumentException();
            }

            return new InsuranceContract(this);
        }
    }
}
