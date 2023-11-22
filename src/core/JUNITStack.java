package core;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {

		public void testCreateNewEmptyStack() {
			Stack s1 = new Stack();
			int size = s1.getSize();
			assertEquals(0, size);
			
		}
		
		public void testPushElement() {
			Stack s1 = new Stack();
			Object elm1 = 1;
			s1.pushElement(elm1);
			Object elm2 = s1.top();
			assertEquals(elm1, elm2);
		}
		
		public void sameType() {
			Stack s1 = new Stack();
			Object elm1 = 1;
			Object elm2 = 'a';
			s1.pushElement(elm1);
			s1.equals(elm2);
			String message = s1.message();
			assertEquals("All elements in the stack must be of the same type.", message);
		}
}
