/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.academic;

import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dell
 */
public class AcademicYearBeanTest extends TestCase {
    
    public AcademicYearBeanTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AcademicYearBeanTest.class);
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
     * Test of getAcyear method, of class AcademicYearBean.
     */
    public void testGetAcyear() {
        System.out.println("getAcyear");
        AcademicYearBean instance = new AcademicYearBean();
        int expResult = 0;
        int result = instance.getAcyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyear method, of class AcademicYearBean.
     */
    public void testSetAcyear() {
        System.out.println("setAcyear");
        int acyear = 0;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setAcyear(acyear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcyid method, of class AcademicYearBean.
     */
    public void testGetAcyid() {
        System.out.println("getAcyid");
        AcademicYearBean instance = new AcademicYearBean();
        int expResult = 0;
        int result = instance.getAcyid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyid method, of class AcademicYearBean.
     */
    public void testSetAcyid() {
        System.out.println("setAcyid");
        int acyid = 0;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setAcyid(acyid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isClosed method, of class AcademicYearBean.
     */
    public void testIsClosed() {
        System.out.println("isClosed");
        AcademicYearBean instance = new AcademicYearBean();
        boolean expResult = false;
        boolean result = instance.isClosed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClosed method, of class AcademicYearBean.
     */
    public void testSetClosed() {
        System.out.println("setClosed");
        boolean closed = false;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setClosed(closed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewAcyear method, of class AcademicYearBean.
     */
    public void testGetNewAcyear() {
        System.out.println("getNewAcyear");
        AcademicYearBean instance = new AcademicYearBean();
        int expResult = 0;
        int result = instance.getNewAcyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewAcyear method, of class AcademicYearBean.
     */
    public void testSetNewAcyear() {
        System.out.println("setNewAcyear");
        int newAcyear = 0;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setNewAcyear(newAcyear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfExam method, of class AcademicYearBean.
     */
    public void testGetNumberOfExam() {
        System.out.println("getNumberOfExam");
        AcademicYearBean instance = new AcademicYearBean();
        int expResult = 0;
        int result = instance.getNumberOfExam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfExam method, of class AcademicYearBean.
     */
    public void testSetNumberOfExam() {
        System.out.println("setNumberOfExam");
        int numberOfExam = 0;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setNumberOfExam(numberOfExam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcyearNo method, of class AcademicYearBean.
     */
    public void testGetAcyearNo() {
        System.out.println("getAcyearNo");
        AcademicYearBean instance = new AcademicYearBean();
        int expResult = 0;
        int result = instance.getAcyearNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyearNo method, of class AcademicYearBean.
     */
    public void testSetAcyearNo() {
        System.out.println("setAcyearNo");
        int acyearNo = 0;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setAcyearNo(acyearNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedRow method, of class AcademicYearBean.
     */
    public void testGetSelectedRow() {
        System.out.println("getSelectedRow");
        AcademicYearBean instance = new AcademicYearBean();
        AcademicYearBean expResult = null;
        AcademicYearBean result = instance.getSelectedRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedRow method, of class AcademicYearBean.
     */
    public void testSetSelectedRow() {
        System.out.println("setSelectedRow");
        AcademicYearBean selectedRow = null;
        AcademicYearBean instance = new AcademicYearBean();
        instance.setSelectedRow(selectedRow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAcyears method, of class AcademicYearBean.
     */
    public void testGetAllAcyears() {
        System.out.println("getAllAcyears");
        AcademicYearBean instance = new AcademicYearBean();
        List<Integer> expResult = null;
        List<Integer> result = instance.getAllAcyears();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertData method, of class AcademicYearBean.
     */
    public void testInsertData() {
        System.out.println("insertData");
        AcademicYearBean instance = new AcademicYearBean();
        instance.insertData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAcademicYear method, of class AcademicYearBean.
     */
    public void testGetAllAcademicYear() {
        System.out.println("getAllAcademicYear");
        AcademicYearBean instance = new AcademicYearBean();
        List<AcademicYearBean> expResult = null;
        List<AcademicYearBean> result = instance.getAllAcademicYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateAcyear method, of class AcademicYearBean.
     */
    public void testValidateAcyear() {
        System.out.println("validateAcyear");
        FacesContext context = null;
        UIComponent component = null;
        Object value = null;
        AcademicYearBean instance = new AcademicYearBean();
        instance.validateAcyear(context, component, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateNumberOfExam method, of class AcademicYearBean.
     */
    public void testValidateNumberOfExam() {
        System.out.println("validateNumberOfExam");
        FacesContext context = null;
        UIComponent component = null;
        Object value = null;
        AcademicYearBean instance = new AcademicYearBean();
        instance.validateNumberOfExam(context, component, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class AcademicYearBean.
     */
    public void testDeleteData() {
        System.out.println("deleteData");
        AcademicYearBean instance = new AcademicYearBean();
        instance.deleteData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class AcademicYearBean.
     */
    public void testClear() {
        System.out.println("clear");
        AcademicYearBean instance = new AcademicYearBean();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
