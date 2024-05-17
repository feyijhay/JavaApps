package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static serialization.Sex.FEMALE;

public class JsonSerializationTest {

    @Test
    public void testJsonSerialization() {
        Person person = new Person();
        person.setName("Name");
        person.setDateOfBirth(LocalDate.now());
        person.setSex(Sex.SHIM);
        person.setPhoneNumber("09023456789");

        String json =  JsonSerializer.serialize(person);
        String expected = "{\"name\":\"Jumoke\",\"dateOfBirth\":\"12/26/1997\",\"phoneNumber\":\"09078480034\",\"sex\":\"SHIM\"}";
        assertEquals(expected, json);
    }

    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person =  new Person("Jumoke", LocalDate.now(), "09078480034", FEMALE);
        String json = JsonSerializer.serialize(person);
        Person personFromJson = JsonSerializer.deserialize(json);
        System.out.println("person from json: "+personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(FEMALE, personFromJson.getSex());
        assertEquals("Jumoke", personFromJson.getName());
        assertEquals("09078480034", personFromJson.getPhoneNumber());


    }
}
