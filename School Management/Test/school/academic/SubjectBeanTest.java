/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.academic;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dell
 */
public class SubjectBeanTest extends TestCase {
    
    public SubjectBeanTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SubjectBeanTest.class);
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

    /**
     * Test of getSubjectCode method, of class SubjectBean.
     */
    public void testGetSubjectCode() {
        System.out.println("getSubjectCode");
        SubjectBean instance = new SubjectBean();
        int expResult = 0;
        int result = instance.getSubjectCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectCode method, of class SubjectBean.
     */
    public void testSetSubjectCode() {
        System.out.println("setSubjectCode");
        int subjectCode = 0;
        SubjectBean instance = new SubjectBean();
        instance.setSubjectCode(subjectCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewSubjectCode method, of class SubjectBean.
     */
    public void testGetNewSubjectCode() {
        System.out.println("getNewSubjectCode");
        SubjectBean instance = new SubjectBean();
        int expResult = 0;
        int result = instance.getNewSubjectCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewSubjectCode method, of class SubjectBean.
     */
    public void testSetNewSubjectCode() {
        System.out.println("setNewSubjectCode");
        int newSubjectCode = 0;
        SubjectBean instance = new SubjectBean();
        instance.setNewSubjectCode(newSubjectCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectId method, of class SubjectBean.
     */
    public void testGetSubjectId() {
        System.out.println("getSubjectId");
        SubjectBean instance = new SubjectBean();
        int expResult = 0;
        int result = instance.getSubjectId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectId method, of class SubjectBean.
     */
    public void testSetSubjectId() {
        System.out.println("setSubjectId");
        int subjectId = 0;
        SubjectBean instance = new SubjectBean();
        instance.setSubjectId(subjectId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectName method, of class SubjectBean.
     */
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        SubjectBean instance = new SubjectBean();
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectName method, of class SubjectBean.
     */
    public void testSetSubjectName() {
        System.out.println("setSubjectName");
        String subjectName = "";
        SubjectBean instance = new SubjectBean();
        instance.setSubjectName(subjectName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectCodes method, of class SubjectBean.
     */
    public void testGetAllSubjectCodes() {
        System.out.println("getAllSubjectCodes");
        SubjectBean instance = new SubjectBean();
        List<Integer> expResult = null;
        List<Integer> result = instance.getAllSubjectCodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSubject method, of class SubjectBean.
     */
    public void testInsertSubject() {
        System.out.println("insertSubject");
        SubjectBean instance = new SubjectBean();
        instance.insertSubject();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectName method, of class SubjectBean.
     */
    public void testGetAllSubjectName() {
        System.out.println("getAllSubjectName");
        SubjectBean instance = new SubjectBean();
        List<SubjectBean> expResult = null;
        List<SubjectBean> result = instance.getAllSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSubjectName method, of class SubjectBean.
     */
    public void testDeleteSubjectName() {
        System.out.println("deleteSubjectName");
        SubjectBean instance = new SubjectBean();
        instance.deleteSubjectName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SubjectBean.
     */
    public void testClear() {
        System.out.println("clear");
        SubjectBean instance = new SubjectBean();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
