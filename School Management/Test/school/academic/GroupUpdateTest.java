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
public class GroupUpdateTest extends TestCase {
    
    public GroupUpdateTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GroupUpdateTest.class);
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
     * Test of getGroupId method, of class GroupUpdate.
     */
    public void testGetGroupId() {
        System.out.println("getGroupId");
        GroupUpdate instance = new GroupUpdate();
        int expResult = 0;
        int result = instance.getGroupId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupId method, of class GroupUpdate.
     */
    public void testSetGroupId() {
        System.out.println("setGroupId");
        int groupId = 0;
        GroupUpdate instance = new GroupUpdate();
        instance.setGroupId(groupId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupName method, of class GroupUpdate.
     */
    public void testGetGroupName() {
        System.out.println("getGroupName");
        GroupUpdate instance = new GroupUpdate();
        String expResult = "";
        String result = instance.getGroupName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupName method, of class GroupUpdate.
     */
    public void testSetGroupName() {
        System.out.println("setGroupName");
        String groupName = "";
        GroupUpdate instance = new GroupUpdate();
        instance.setGroupName(groupName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isGroupStatus method, of class GroupUpdate.
     */
    public void testIsGroupStatus() {
        System.out.println("isGroupStatus");
        GroupUpdate instance = new GroupUpdate();
        boolean expResult = false;
        boolean result = instance.isGroupStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupStatus method, of class GroupUpdate.
     */
    public void testSetGroupStatus() {
        System.out.println("setGroupStatus");
        boolean groupStatus = false;
        GroupUpdate instance = new GroupUpdate();
        instance.setGroupStatus(groupStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNewGroupName method, of class GroupUpdate.
     */
    public void testGetNewGroupName() {
        System.out.println("getNewGroupName");
        GroupUpdate instance = new GroupUpdate();
        String expResult = "";
        String result = instance.getNewGroupName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNewGroupName method, of class GroupUpdate.
     */
    public void testSetNewGroupName() {
        System.out.println("setNewGroupName");
        String newGroupName = "";
        GroupUpdate instance = new GroupUpdate();
        instance.setNewGroupName(newGroupName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedRow method, of class GroupUpdate.
     */
    public void testGetSelectedRow() {
        System.out.println("getSelectedRow");
        GroupUpdate instance = new GroupUpdate();
        GroupBean expResult = null;
        GroupBean result = instance.getSelectedRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedRow method, of class GroupUpdate.
     */
    public void testSetSelectedRow() {
        System.out.println("setSelectedRow");
        GroupBean selectedRow = null;
        GroupUpdate instance = new GroupUpdate();
        instance.setSelectedRow(selectedRow);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGroups method, of class GroupUpdate.
     */
    public void testGetAllGroups() {
        System.out.println("getAllGroups");
        GroupUpdate instance = new GroupUpdate();
        List<String> expResult = null;
        List<String> result = instance.getAllGroups();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doSetSelectedRow method, of class GroupUpdate.
     */
    public void testDoSetSelectedRow() {
        System.out.println("doSetSelectedRow");
        GroupUpdate instance = new GroupUpdate();
        instance.doSetSelectedRow();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of groupUpdateData method, of class GroupUpdate.
     */
    public void testGroupUpdateData() {
        System.out.println("groupUpdateData");
        GroupUpdate instance = new GroupUpdate();
        instance.groupUpdateData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class GroupUpdate.
     */
    public void testClear() {
        System.out.println("clear");
        GroupUpdate instance = new GroupUpdate();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
