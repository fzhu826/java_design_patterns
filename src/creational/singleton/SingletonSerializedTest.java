/**
 * 
 */
package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author Administrator
 *
 */
public class SingletonSerializedTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(
        		new FileOutputStream("file.ser"));
        out.writeObject(instanceOne);
        
        out.close();
        ObjectInput input = new ObjectInputStream(
        		new FileInputStream("file.ser"));
        SerializedSingleton instanceTwo= (SerializedSingleton)input.readObject();
        input.close();
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
        
        
	}

}
