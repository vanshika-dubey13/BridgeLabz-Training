package com.collections.set;
import java.time.LocalDate;
import java.util.*;

//creating a class to demonstrate Insurance Policy Management System

public class InsurancePolicyManagementSystem {

    // static class to store policy details
    static class Policy {
    	//attributes
        String policyNumber;
        String policyHolderName;
        LocalDate policyExpiryDate;
        String coverageType;
        double premiumAmount;

        //constructor
        Policy(String policyNumber, String policyHolderName,
               LocalDate policyExpiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyHolderName = policyHolderName;
            this.policyExpiryDate = policyExpiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        //checking if policy already exists
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Policy)) return false;
            Policy policy = (Policy) o;
            return policyNumber.equals(policy.policyNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(policyNumber);
        }

        @Override
        public String toString() {
            return policyNumber + " | " + policyHolderName + " | " +
            		policyExpiryDate + " | " + coverageType + " | $" + premiumAmount;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    static Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(p -> p.expiryDate));

    public static void main(String[] args) {

    	//displaying menu
        while (true) {
            System.out.println("\n--- Insurance Policy Management System ---");
            System.out.println("1. Add Policy");
            System.out.println("2. Display All Policies");
            System.out.println("3. Policies Expiring in 30 Days");
            System.out.println("4. Policies by Coverage Type");
            System.out.println("5. Duplicate Policy Numbers");
            System.out.println("6. Performance Comparison");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addPolicy();
                case 2 -> displayPolicies();
                case 3 -> expiringSoon();
                case 4 -> coverageTypeSearch();
                case 5 -> findDuplicates();
                case 6 -> performanceTest();
                case 7 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    	// method to add policy
    	public static void addPolicy() {
    		System.out.print("Policy Number: ");
    		String number = sc.nextLine();

    		System.out.print("Policy Holder Name: ");
    		String name = sc.nextLine();

    		System.out.print("Expiry Date (YYYY-MM-DD): ");
    		LocalDate date = LocalDate.parse(sc.nextLine());

    		System.out.print("Coverage Type: ");
    		String coverage = sc.nextLine();

    		System.out.print("Premium Amount: ");
    		double premium = sc.nextDouble();

    		Policy policy = new Policy(number, name, date, coverage, premium);

    		hashSet.add(policy);
    		linkedHashSet.add(policy);
    		treeSet.add(policy);

    		System.out.println("Policy added successfully.");
    	}

    	// method to display all policies
    	public static void displayPolicies() {
    		System.out.println("\n--- All Unique Policies ---");
    		hashSet.forEach(System.out::println);
    	}

    	// method to check expiry within 30 days
    	public static void expiringSoon() {
    		LocalDate today = LocalDate.now();
    		LocalDate next30 = today.plusDays(30);

    		System.out.println("\n--- Policies Expiring Soon ---");
    		for (Policy p : treeSet) {
    			if (!p.policyExpiryDate.isBefore(today) && !p.expiryDate.isAfter(next30)) {
    				System.out.println(p);
    			}
    		}
    	}

    	// method to search by coverage type
    	public static void coverageTypeSearch() {
    		System.out.print("Enter Coverage Type: ");
    		String type = sc.nextLine();

    		System.out.println("\n--- Policies with " + type + " Coverage ---");
    		for (Policy p : hashSet) {
    			if (p.coverageType.equalsIgnoreCase(type)) {
    				System.out.println(p);
    			}
    		}
    	}

    	// method to find duplicates
    	public static void findDuplicates() {
    		Set<String> seen = new HashSet<>();
    		Set<String> duplicates = new HashSet<>();

    		for (Policy p : hashSet) {
    			if (!seen.add(p.policyNumber)) {
    				duplicates.add(p.policyNumber);
    			}
    		}

    		System.out.println("Duplicate Policy Numbers: " + duplicates);
    	}

    	// Performance comparison
    	public static void performanceTest() {
    		Policy test = new Policy("TEST001", "Test User",
    				LocalDate.now().plusDays(10), "Health", 5000);

    		testPerformance("HashSet", hashSet, test);
    		testPerformance("LinkedHashSet", linkedHashSet, test);
    		testPerformance("TreeSet", treeSet, test);
    	}

    	public static void testPerformance(String name, Set<Policy> set, Policy policy) {
    		long start, end;

    		start = System.nanoTime();
    		set.add(policy);
    		end = System.nanoTime();
    		System.out.println(name + " Add Time: " + (end - start));

    		start = System.nanoTime();
    		set.contains(policy);
    		end = System.nanoTime();
    		System.out.println(name + " Search Time: " + (end - start));

    		start = System.nanoTime();
    		set.remove(policy);
    		end = System.nanoTime();
    		System.out.println(name + " Remove Time: " + (end - start));
    		System.out.println();
    	}
}

