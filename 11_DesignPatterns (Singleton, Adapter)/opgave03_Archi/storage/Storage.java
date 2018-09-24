package storage;

import java.util.ArrayList;

import model.Company;
import model.Employee;

public class Storage {

    private static Storage storage;

    private static ArrayList<Company> companies = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();

    private Storage() {

    }

    public static Storage getStorage() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    public static void addCompany(Company company) {
        companies.add(company);
    }

    public static void removeCompany(Company company) {
        companies.remove(company);
    }

    // -------------------------------------------------------------------------

    public static ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

}
