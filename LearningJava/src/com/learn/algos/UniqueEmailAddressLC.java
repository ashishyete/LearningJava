package com.learn.algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEmailAddressLC {

	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
	}

	public static int numUniqueEmails(String[] emails) {
		Set<String> ss = new HashSet<String>();

		for (String email : emails) {
			int i = email.indexOf('@');
			String prefix = email.substring(0, i);
			String suffix = email.substring(i);
			prefix = prefix.replaceAll(".", "");
			if (suffix.contains("+")) {
				suffix = suffix.substring(0, suffix.indexOf('+'));
			}
			ss.add(prefix + suffix);
			System.out.println(ss);
		}
		return ss.size();
	}
}
