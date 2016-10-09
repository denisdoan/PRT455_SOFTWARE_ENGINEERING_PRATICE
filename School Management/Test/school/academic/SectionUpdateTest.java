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
public class SectionUpdateTest extends TestCase {
    
    public SectionUpdateTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SectionUpdateTest.class);
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
     * Test of getAcyear method, of class SectionUpdate.
     */
    public void testGetAcyear() {
        System.out.println("getAcyear");
        SectionUpdate instance = new SectionUpdate();
        int expResult = 0;
        int result = instance.getAcyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyear method, of class SectionUpdate.
     */
    public void testSetAcyear() {
        System.out.println("setAcyear");
        int acyear = 0;
        SectionUpdate instance = new SectionUpdate();
        instance.setAcyear(acyear);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAcyearId method, of class SectionUpdate.
     */
    public void testGetAcyearId() {
        System.out.println("getAcyearId");
        SectionUpdate instance = new SectionUpdate();
        int expResult = 0;
        int result = instance.getAcyearId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyearId method, of class SectionUpdate.
     */
    public void testSetAcyearId() {
        System.out.println("setAcyearId");
        int acyearId = 0;
        SectionUpdate instance = new SectionUpdate();
        instance.setAcyearId(acyearId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassId method, of class SectionUpdate.
     */
    public void testGetClassId() {
        System.out.println("getClassId");
        SectionUpdate instance = new SectionUpdate();
        int expResult = 0;
        int result = instance.getClassId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassId method, of class SectionUpdate.
     */
    public void testSetClassId() {
        System.out.println("setClassId");
        int classId = 0;
        SectionUpdate instance = new SectionUpdate();
        instance.setClassId(classId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassName method, of class SectionUpdate.
     */
    public void testGetClassName() {
        System.out.println("getClassName");
        SectionUpdate instance = new SectionUpdate();
        String expResult = "";
        String result = instance.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassName method, of class SectionUpdate.
     */
    public void testSetClassName() {
        System.out.println("setClassName");
        String className = "";
        SectionUpdate instance = new SectionUpdate();
        instance.setClassName(className);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionId method, of class SectionUpdate.
     */
    public void testGetSectionId() {
        System.out.println("getSectionId");
        SectionUpdate instance = new SectionUpdate();
        int expResult = 0;
        int result = instance.getSectionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionId method, of class SectionUpdate.
     */
    public void testSetSectionId() {
        System.out.println("setSectionId");
        int sectionId = 0;
        SectionUpdate instance = new SectionUpdate();
        instance.setSectionId(sectionId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionName method, of class SectionUpdate.
     */
    public void testGetSectionName() {
        System.out.println("getSectionName");
        SectionUpdate instance = new SectionUpdate();
        String expResult = "";
        String result = instance.getSectionName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionName method, of class SectionUpdate.
     */
    public void testSetSectionName() {
        System.out.println("setSectionName");
        String sectionName = "";
        SectionUpdate instance = new SectionUpdate();
        instance.setSectionName(sectionName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedRow method, of class SectionUpdate.
     */
    public void testGetSelectedRow() {
        System.out.println("getSelectedRow");
        SectionUpdate instance = new SectionUpdate();
        SectionBean expResult = null;
        SectionBean result = instance.getSelectedRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedRow method, of class SectionUpdate.
     */
    public void testSetSelectedRow() {
        System.out.println("setSelectedRow");
        SectionBean selectedRow = null;
        SectionUpdate instance = new SectionUpdate();
        instance.setSelectedRow(selectedRow);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAcyears method, of class SectionUpdate.
     */
    public void testGetAllAcyears() {
        System.out.println("getAllAcyears");
        SectionUpdate instance = new SectionUpdate();
        List<SectionUpdate> expResult = null;
        List<SectionUpdate> result = instance.getAllAcyears();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClasses method, of class SectionUpdate.
     */
    public void testGetAllClasses() {
        System.out.println("getAllClasses");
        SectionUpdate instance = new SectionUpdate();
        List<SectionUpdate> expResult = null;
        List<SectionUpdate> result = instance.getAllClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of prepareUpdate method, of class SectionUpdate.
     */
    public void testPrepareUpdate() {
        System.out.println("prepareUpdate");
        SectionUpdate instance = new SectionUpdate();
        instance.prepareUpdate();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateSection method, of class SectionUpdate.
     */
    public void testUpdateSection() {
        System.out.println("updateSection");
        SectionUpdate instance = new SectionUpdate();
        instance.updateSection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SectionUpdate.
     */
    public void testClear() {
        System.out.println("clear");
        SectionUpdate instance = new SectionUpdate();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
