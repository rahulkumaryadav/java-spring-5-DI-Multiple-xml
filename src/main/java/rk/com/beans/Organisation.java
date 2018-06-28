package rk.com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Organisation {
    private String orgName;
    @Autowired
    private Pic picOrg;
    @Autowired
    private Employee employeeOrg;

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setPicOrg(Pic picOrg) {
        this.picOrg = picOrg;
    }

    public void setEmployeeOrg(Employee employeeOrg) {
        this.employeeOrg = employeeOrg;
    }

    @Override
    public String toString() {
        return "Organisation{" +
                "orgName='" + orgName + '\'' +
                ", picOrg=" + picOrg +
                ", employeeOrg=" + employeeOrg +
                '}';
    }
}
