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
public class SubjectUpdateTest extends TestCase {
    
    public SubjectUpdateTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SubjectUpdateTest.class);
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
     * Test of getNewSubjectCode method, of class SubjectUpdate.
     */
    public void testGetNewSubjectCode() {
        System.out.println("getNewSubjectCode");
        SubjectUpdate instance = new SubjectUpdate();
        int expResult = 0;
        int result = instance.getNewSubjectCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNewSubjectCode method, of class SubjectUpdate.
     */
    public void testSetNewSubjectCode() {
        System.out.println("setNewSubjectCode");
        int newSubjectCode = 0;
        SubjectUpdate instance = new SubjectUpdate();
        instance.setNewSubjectCode(newSubjectCode);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedRow method, of class SubjectUpdate.
     */
    public void testGetSelectedRow() {
        System.out.println("getSelectedRow");
        SubjectUpdate instance = new SubjectUpdate();
        SubjectBean expResult = null;
        SubjectBean result = instance.getSelectedRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype."); 
    }

    /**
     * Test of setSelectedRow method, of class SubjectUpdate.
     */
    public void testSetSelectedRow() {
        System.out.println("setSelectedRow");
        SubjectBean selectedRow = null;
        SubjectUpdate instance = new SubjectUpdate();
        instance.setSelectedRow(selectedRow);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectCode method, of class SubjectUpdate.
     */
    public void testGetSubjectCode() {
        System.out.println("getSubjectCode");
        SubjectUpdate instance = new SubjectUpdate();
        int expResult = 0;
        int result = instance.getSubjectCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectCode method, of class SubjectUpdate.
     */
    public void testSetSubjectCode() {
        System.out.println("setSubjectCode");
        int subjectCode = 0;
        SubjectUpdate instance = new SubjectUpdate();
        instance.setSubjectCode(subjectCode);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectId method, of class SubjectUpdate.
     */
    public void testGetSubjectId() {
        System.out.println("getSubjectId");
        SubjectUpdate instance = new SubjectUpdate();
        int expResult = 0;
        int result = instance.getSubjectId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectId method, of class SubjectUpdate.
     */
    public void testSetSubjectId() {
        System.out.println("setSubjectId");
        int subjectId = 0;
        SubjectUpdate instance = new SubjectUpdate();
        instance.setSubjectId(subjectId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectName method, of class SubjectUpdate.
     */
    public void testGetSubjectName() {
        System.out.println("getSubjectName");
        SubjectUpdate instance = new SubjectUpdate();
        String expResult = "";
        String result = instance.getSubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectName method, of class SubjectUpdate.
     */
    public void testSetSubjectName() {
        System.out.println("setSubjectName");
        String subjectName = "";
        SubjectUpdate instance = new SubjectUpdate();
        instance.setSubjectName(subjectName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doSetSelectedRow method, of class SubjectUpdate.
     */
    public void testDoSetSelectedRow() {
        System.out.println("doSetSelectedRow");
        SubjectUpdate instance = new SubjectUpdate();
        instance.doSetSelectedRow();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubjectCodes method, of class SubjectUpdate.
     */
    public void testGetAllSubjectCodes() {
        System.out.println("getAllSubjectCodes");
        SubjectUpdate instance = new SubjectUpdate();
        List<Integer> expResult = null;
        List<Integer> result = instance.getAllSubjectCodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateSubjectName method, of class SubjectUpdate.
     */
    public void testUpdateSubjectName() {
        System.out.println("updateSubjectName");
        SubjectUpdate instance = new SubjectUpdate();
        instance.updateSubjectName();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
