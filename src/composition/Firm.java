package composition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Firm {
    private String nip;
    private String firmName;
    private Map<Integer, Department> departments = new HashMap<>();
    public static int counter;

    public Firm(String nip, String firmName) {
        this.setNip(nip);
        this.setFirmName(firmName);
    }

    public void createDepartment(String id, String deptName) {
        Department newDepartment = new Department(id, deptName);
        departments.put(counter, newDepartment);
        counter++;
    }

    public void removeDepartment(int id) {
        departments.remove(id);
        if (id >= counter) {
            counter--;
        }
    }

    public List<Department> findDepartmentByName(String deptName) {
        List<Department> departmentList = new ArrayList<>();
        for (Map.Entry<Integer, Department> entry : departments.entrySet()) {
            if (entry.getValue().getDeptName() == deptName) {
                departmentList.add(entry.getValue());
            }
        }
        return departmentList;
    }

    public Map<Integer, Department> getDepartments() {
        return this.departments;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        if (nip == null) {
            throw new IllegalArgumentException("Nip shouldn't be null!");
        }
        this.nip = nip;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        if (firmName == null) {
            throw new IllegalArgumentException("Firm name shouldn't be null");
        }
        this.firmName = firmName;
    }

    private class Department {
        private String id;
        private String deptName;

        public Department(String id, String deptName) {
            this.setDeptName(deptName);
            this.setId(id);
        }

        public String getDeptName() {
            return deptName;
        }

        public void setDeptName(String deptName) {
            if (deptName == null) {
                throw new IllegalArgumentException("Dept Name shouldn't be null!");
            }
            this.deptName = deptName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            if (id == null) {
                throw new IllegalArgumentException("Id shouldn't be null");
            }
            this.id = id;
        }

        public String toString() {
            return getId() + " " + getDeptName();
        }
    }

    public String toString() {
        return "Firm: " + getFirmName() + ", Departments: " + getDepartments();

    }
}
