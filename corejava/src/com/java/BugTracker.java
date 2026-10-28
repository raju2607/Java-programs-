package com.java;

public class BugTracker {
	int Bugid;
	String ApplicationName;
	String BugTitle;
	String Severity;
	String Priority;
	String Status;
	String AssignedDeveloper;

	public static void main(String[] args) {
		BugTracker b = new BugTracker();
		b.Bugid = 2101;
		b.ApplicationName = "employee";
		b.BugTitle = "Login Error";
		b.Severity = "High";
		b.Priority = "P1";
		b.Status = "Open";
		b.AssignedDeveloper = "Not Assigned";

		b.bugTitle();
		b.applicationName();
		b.bugTitle();
		b.severity();
		b.priority();
		b.status();
		b.assignedDeveloper();

	}

	void getBugId() {
		System.out.println("Bug ID : " + Bugid);

	}

	void applicationName() {
		System.out.println("applicationName : " + ApplicationName);

	}

	void bugTitle() {
		System.out.println("bugTitle :" + BugTitle);

	}

	void severity() {
		System.out.println("severity :" + Severity);

	}

	void priority() {
		System.out.println("priority :" + Priority);

	}

	void status() {
		System.out.println("status :" + Status);

	}

	void assignedDeveloper() {
		System.out.println("assignedDeveloper:" + AssignedDeveloper);

	}

}
