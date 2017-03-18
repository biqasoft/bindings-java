package com.biqasoft.entity.core;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Nikita on 9/6/2016.
 */
@Test
public class BaseClassTest {

    @Test
    public void testObjectId() throws Exception {
        TestBaseClassImpl testBaseClass = new TestBaseClassImpl();
        validateObject(testBaseClass);

        TestBaseClassImpl testBaseClass2 = new TestBaseClassImpl();
        validateObject(testBaseClass2);

        TestBaseClassImpl testBaseClass3 = new TestBaseClassImpl();
        validateObject(testBaseClass3);

        Assert.assertNotEquals(testBaseClass.getId(), testBaseClass2.getId());
        Assert.assertNotEquals(testBaseClass2.getId(), testBaseClass3.getId());
    }

    private void validateObject(BaseClass baseClass){
        Assert.assertNull(baseClass.id);
        Assert.assertNotNull(baseClass.getId());
    }

}

class TestBaseClassImpl extends BaseClass {

}
