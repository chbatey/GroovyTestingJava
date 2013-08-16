import org.junit.Test

import static org.junit.Assert.assertEquals


class PersonTest {
    @Test
    void testFullNameCreation() {
        def person = new Person('Chris', 'Batey')
        assertEquals('Chris Batey', person.fullName)
    }
}