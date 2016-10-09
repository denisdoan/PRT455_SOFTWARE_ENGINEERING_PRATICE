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
public class GroupBeanTest extends TestCase {
    
    public GroupBeanTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GroupBeanTest.class);
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
     * Test of getGroupId method, of class GroupBean.
     */
    public void testGetGroupId() {
        System.out.println("getGroupId");
        GroupBean instance = new GroupBean();
        int expResult = 0;
        int result = instance.getGroupId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupId method, of class GroupBean.
     */
    public void testSetGroupId() {
        System.out.println("setGroupId");
        int groupId = 0;
        GroupBean instance = new GroupBean();
        instance.setGroupId(groupId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupName method, of class GroupBean.
     */
    public void testGetGroupName() {
        System.out.println("getGroupName");
        GroupBean instance = new GroupBean();
        String expResult = "";
        String result = instance.getGroupName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupName method, of class GroupBean.
     */
    public void testSetGroupName() {
        System.out.println("setGroupName");
        String groupName = "";
        GroupBean instance = new GroupBean();
        instance.setGroupName(groupName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNewGroupName method, of class GroupBean.
     */
    public void testGetNewGroupName() {
        System.out.println("getNewGroupName");
        GroupBean instance = new GroupBean();
        String expResult = "";
        String result = instance.getNewGroupName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNewGroupName method, of class GroupBean.
     */
    public void testSetNewGroupName() {
        System.out.println("setNewGroupName");
        String newGroupName = "";
        GroupBean instance = new GroupBean();
        instance.setNewGroupName(newGroupName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isGroupStatus method, of class GroupBean.
     */
    public void testIsGroupStatus() {
        System.out.println("isGroupStatus");
        GroupBean instance = new GroupBean();
        boolean expResult = false;
        boolean result = instance.isGroupStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupStatus method, of class GroupBean.
     */
    public void testSetGroupStatus() {
        System.out.println("setGroupStatus");
        boolean groupStatus = false;
        GroupBean instance = new GroupBean();
        instance.setGroupStatus(groupStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertGroupName method, of class GroupBean.
     */
    public void testInsertGroupName() {
        System.out.println("insertGroupName");
        GroupBean instance = new GroupBean();
        instance.insertGroupName();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGroups method, of class GroupBean.
     */
    public void testGetAllGroups() {
        System.out.println("getAllGroups");
        GroupBean instance = new GroupBean();
        List<String> expResult = null;
        List<String> result = instance.getAllGroups();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGroupName method, of class GroupBean.
     */
    public void testGetAllGroupName() {
        System.out.println("getAllGroupName");
        GroupBean instance = new GroupBean();
        List<GroupBean> expResult = null;
        List<GroupBean> result = instance.getAllGroupName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of groupDeleteData method, of class GroupBean.
     */
    public void testGroupDeleteData() {
        System.out.println("groupDeleteData");
        GroupBean instance = new GroupBean();
        instance.groupDeleteData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class GroupBean.
     */
    public void testClear() {
        System.out.println("clear");
        GroupBean instance = new GroupBean();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
