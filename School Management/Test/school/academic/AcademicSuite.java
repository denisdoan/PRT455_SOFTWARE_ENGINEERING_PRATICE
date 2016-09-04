/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.academic;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dell
 */
public class AcademicSuite extends TestCase {
    
    public AcademicSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("AcademicSuite");
        suite.addTest(SubjectUpdateTest.suite());
        suite.addTest(SectionBeanTest.suite());
        suite.addTest(AcademicYearBeanTest.suite());
        suite.addTest(SectionUpdateTest.suite());
        suite.addTest(AcademicYearUpdateTest.suite());
        suite.addTest(GroupUpdateTest.suite());
        suite.addTest(SubjectBeanTest.suite());
        suite.addTest(GroupBeanTest.suite());
        suite.addTest(ClassBeanTest.suite());
        suite.addTest(StudentAttendBeanTest.suite());
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
}
