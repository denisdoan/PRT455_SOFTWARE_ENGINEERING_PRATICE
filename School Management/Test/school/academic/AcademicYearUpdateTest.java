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
public class AcademicYearUpdateTest extends TestCase {
    
    public AcademicYearUpdateTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AcademicYearUpdateTest.class);
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
     * Test of getAcyid method, of class AcademicYearUpdate.
     */
    public void testGetAcyid() {
        System.out.println("getAcyid");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        int expResult = 0;
        int result = instance.getAcyid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyid method, of class AcademicYearUpdate.
     */
    public void testSetAcyid() {
        System.out.println("setAcyid");
        int acyid = 0;
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.setAcyid(acyid);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNewAcyear method, of class AcademicYearUpdate.
     */
    public void testGetNewAcyear() {
        System.out.println("getNewAcyear");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        int expResult = 0;
        int result = instance.getNewAcyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNewAcyear method, of class AcademicYearUpdate.
     */
    public void testSetNewAcyear() {
        System.out.println("setNewAcyear");
        int newAcyear = 0;
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.setNewAcyear(newAcyear);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAcyear method, of class AcademicYearUpdate.
     */
    public void testGetAcyear() {
        System.out.println("getAcyear");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        int expResult = 0;
        int result = instance.getAcyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyear method, of class AcademicYearUpdate.
     */
    public void testSetAcyear() {
        System.out.println("setAcyear");
        int acyear = 0;
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.setAcyear(acyear);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isClosed method, of class AcademicYearUpdate.
     */
    public void testIsClosed() {
        System.out.println("isClosed");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        boolean expResult = false;
        boolean result = instance.isClosed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClosed method, of class AcademicYearUpdate.
     */
    public void testSetClosed() {
        System.out.println("setClosed");
        boolean closed = false;
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.setClosed(closed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfExam method, of class AcademicYearUpdate.
     */
    public void testGetNumberOfExam() {
        System.out.println("getNumberOfExam");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        int expResult = 0;
        int result = instance.getNumberOfExam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfExam method, of class AcademicYearUpdate.
     */
    public void testSetNumberOfExam() {
        System.out.println("setNumberOfExam");
        int numberOfExam = 0;
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.setNumberOfExam(numberOfExam);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedRow method, of class AcademicYearUpdate.
     */
    public void testGetSelectedRow() {
        System.out.println("getSelectedRow");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        AcademicYearBean expResult = null;
        AcademicYearBean result = instance.getSelectedRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedRow method, of class AcademicYearUpdate.
     */
    public void testSetSelectedRow() {
        System.out.println("setSelectedRow");
        AcademicYearBean selectedRow = null;
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.setSelectedRow(selectedRow);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAcyears method, of class AcademicYearUpdate.
     */
    public void testGetAllAcyears() {
        System.out.println("getAllAcyears");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        List<Integer> expResult = null;
        List<Integer> result = instance.getAllAcyears();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doSetSelectedRow method, of class AcademicYearUpdate.
     */
    public void testDoSetSelectedRow() {
        System.out.println("doSetSelectedRow");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.doSetSelectedRow();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateData method, of class AcademicYearUpdate.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        AcademicYearUpdate instance = new AcademicYearUpdate();
        instance.updateData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
