package ie.atu.dip;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

//Select All Classes To Tested
@Suite
@SelectClasses({ 
	ApplicantTest.class, 
	Under25Test.class, 
	Over25Test.class
})

//Run All Tests Selected
class TestSuite {

}
