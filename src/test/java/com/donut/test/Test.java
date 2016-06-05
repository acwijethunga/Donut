package com.donut.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.donut.tests.LoginTest;



@RunWith(Suite.class)
@Suite.SuiteClasses({
  //include test class Names here
	LoginTest.class
	
})

public class Test {

}
