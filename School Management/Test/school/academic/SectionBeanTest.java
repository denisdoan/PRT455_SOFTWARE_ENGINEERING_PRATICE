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
public class SectionBeanTest extends TestCase {
    
    public SectionBeanTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SectionBeanTest.class);
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
     * Test of getAcyear method, of class SectionBean.
     */
    public void testGetAcyear() {
        System.out.println("getAcyear");
        SectionBean instance = new SectionBean();
        int expResult = 0;
        int result = instance.getAcyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyear method, of class SectionBean.
     */
    public void testSetAcyear() {
        System.out.println("setAcyear");
        int acyear = 0;
        SectionBean instance = new SectionBean();
        instance.setAcyear(acyear);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAcyearId method, of class SectionBean.
     */
    public void testGetAcyearId() {
        System.out.println("getAcyearId");
        SectionBean instance = new SectionBean();
        int expResult = 0;
        int result = instance.getAcyearId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAcyearId method, of class SectionBean.
     */
    public void testSetAcyearId() {
        System.out.println("setAcyearId");
        int acyearId = 0;
        SectionBean instance = new SectionBean();
        instance.setAcyearId(acyearId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassId method, of class SectionBean.
     */
    public void testGetClassId() {
        System.out.println("getClassId");
        SectionBean instance = new SectionBean();
        int expResult = 0;
        int result = instance.getClassId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassId method, of class SectionBean.
     */
    public void testSetClassId() {
        System.out.println("setClassId");
        int classId = 0;
        SectionBean instance = new SectionBean();
        instance.setClassId(classId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassName method, of class SectionBean.
     */
    public void testGetClassName() {
        System.out.println("getClassName");
        SectionBean instance = new SectionBean();
        String expResult = "";
        String result = instance.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassName method, of class SectionBean.
     */
    public void testSetClassName() {
        System.out.println("setClassName");
        String className = "";
        SectionBean instance = new SectionBean();
        instance.setClassName(className);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionId method, of class SectionBean.
     */
    public void testGetSectionId() {
        System.out.println("getSectionId");
        SectionBean instance = new SectionBean();
        int expResult = 0;
        int result = instance.getSectionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionId method, of class SectionBean.
     */
    public void testSetSectionId() {
        System.out.println("setSectionId");
        int sectionId = 0;
        SectionBean instance = new SectionBean();
        instance.setSectionId(sectionId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionName method, of class SectionBean.
     */
    public void testGetSectionName() {
        System.out.println("getSectionName");
        SectionBean instance = new SectionBean();
        String expResult = "";
        String result = instance.getSectionName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionName method, of class SectionBean.
     */
    public void testSetSectionName() {
        System.out.println("setSectionName");
        String sectionName = "";
        SectionBean instance = new SectionBean();
        instance.setSectionName(sectionName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSectionName method, of class SectionBean.
     */
    public void testGetAllSectionName() {
        System.out.println("getAllSectionName");
        SectionBean instance = new SectionBean();
        List<SectionBean> expResult = null;
        List<SectionBean> result = instance.getAllSectionName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClasses method, of class SectionBean.
     */
    public void testGetAllClasses() {
        System.out.println("getAllClasses");
        SectionBean instance = new SectionBean();
        List<SectionBean> expResult = null;
        List<SectionBean> result = instance.getAllClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAcyears method, of class SectionBean.
     */
    public void testGetAllAcyears() {
        System.out.println("getAllAcyears");
        SectionBean instance = new SectionBean();
        List<SectionBean> expResult = null;
        List<SectionBean> result = instance.getAllAcyears();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertSection method, of class SectionBean.
     */
    public void testInsertSection() {
        System.out.println("insertSection");
        SectionBean instance = new SectionBean();
        instance.insertSection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSection method, of class SectionBean.
     */
    public void testDeleteSection() {
        System.out.println("deleteSection");
        SectionBean instance = new SectionBean();
        instance.deleteSection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SectionBean.
     */
    public void testClear() {
        System.out.println("clear");
        SectionBean instance = new SectionBean();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
