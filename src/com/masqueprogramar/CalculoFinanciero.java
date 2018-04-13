package com.masqueprogramar;

import java.math.BigDecimal;

public class CalculoFinanciero {
	
	public static void main(String[] args) {
		
		System.out.println("--- Double-----");
        System.out.println(0.00 + 0.1);
        System.out.println(0.10 + 0.1);
        System.out.println(0.20 + 0.1);
        System.out.println(0.30 + 0.1);
        System.out.println(0.40 + 0.1);
        System.out.println(0.50 + 0.1);
        System.out.println(0.60 + 0.1);
        System.out.println(0.70 + 0.1);
        System.out.println(0.80 + 0.1);
        System.out.println(0.90 + 0.1);
        
        System.out.println("\n--- BigDecimal-----");
        System.out.println(new BigDecimal("0.00").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.10").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.20").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.30").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.40").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.50").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.60").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.70").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.80").add(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.90").add(new BigDecimal("0.1")));
	}
}
