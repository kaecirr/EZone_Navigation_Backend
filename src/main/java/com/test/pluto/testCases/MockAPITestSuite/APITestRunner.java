package com.test.pluto.testCases.MockAPITestSuite;

import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class APITestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(APITestSuite.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  	