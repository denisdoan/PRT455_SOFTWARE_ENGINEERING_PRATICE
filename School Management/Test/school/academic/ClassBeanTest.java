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
public class ClassBeanTest extends TestCase {
    
    public ClassBeanTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ClassBeanTest.class);
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
     * Test of getClassId method, of class ClassBean.
     */
    public void testGetClassId() {
        System.out.println("getClassId");
        ClassBean instance = new ClassBean();
        int expResult = 0;
        int result = instance.getClassId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassId method, of class ClassBean.
     */
    public void testSetClassId() {
        System.out.println("setClassId");
        int classId = 0;
        ClassBean instance = new ClassBean();
        instance.setClassId(classId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClassName method, of class ClassBean.
     */
    public void testGetClassName() {
        System.out.println("getClassName");
        ClassBean instance = new ClassBean();
        String expResult = "";
        String result = instance.getClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClassName method, of class ClassBean.
     */
    public void testSetClassName() {
        System.out.println("setClassName");
        String className = "";
        ClassBean instance = new ClassBean();
        instance.setClassName(className);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNewClassName method, of class ClassBean.
     */
    public void testGetNewClassName() {
        System.out.println("getNewClassName");
        ClassBean instance = new ClassBean();
        String expResult = "";
        String result = instance.getNewClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNewClassName method, of class ClassBean.
     */
    public void testSetNewClassName() {
        System.out.println("setNewClassName");
        String newClassName = "";
        ClassBean instance = new ClassBean();
        instance.setNewClassName(newClassName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialNo method, of class ClassBean.
     */
    public void testGetSerialNo() {
        System.out.println("getSerialNo");
        ClassBean instance = new ClassBean();
        int expResult = 0;
        int result = instance.getSerialNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSerialNo method, of class ClassBean.
     */
    public void testSetSerialNo() {
        System.out.println("setSerialNo");
        int serialNo = 0;
        ClassBean instance = new ClassBean();
        instance.setSerialNo(serialNo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertClassName method, of class ClassBean.
     */
    public void testInsertClassName() {
        System.out.println("insertClassName");
        ClassBean instance = new ClassBean();
        instance.insertClassName();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClasses method, of class ClassBean.
     */
    public void testGetAllClasses() {
        System.out.println("getAllClasses");
        ClassBean instance = new ClassBean();
        List<String> expResult = null;
        List<String> result = instance.getAllClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClassName method, of class ClassBean.
     */
    public void testGetAllClassName() {
        System.out.println("getAllClassName");
        ClassBean instance = new ClassBean();
        List<ClassBean> expResult = null;
        List<ClassBean> result = instance.getAllClassName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateData method, of class ClassBean.
     */
    public void testUpdateData() {
        System.out.println("updateData");
        ClassBean instance = new ClassBean();
        instance.updateData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class ClassBean.
     */
    public void testDeleteData() {
        System.out.println("deleteData");
        ClassBean instance = new ClassBean();
        instance.deleteData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ClassBean.
     */
    public void testClear() {
        System.out.println("clear");
        ClassBean instance = new ClassBean();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
