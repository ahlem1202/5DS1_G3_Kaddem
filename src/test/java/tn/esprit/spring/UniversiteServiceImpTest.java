/*package tn.esprit.spring;

import lombok.extern.slf4j.Slf4j;


import org.junit.jupiter.api.Test;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import tn.esprit.spring.kaddem.entities.Departement;
        import tn.esprit.spring.kaddem.entities.Universite;
        import tn.esprit.spring.kaddem.services.IUniversiteService;

        import java.util.List;
        import java.util.Set;

        import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class UniversiteServiceImplTest {

   // private static final Logger log = LoggerFactory.getLogger(UniversiteServiceImplTest.class);

    @Autowired
    private IUniversiteService universiteService;

    @BeforeEach
    public void setUp() {
        // You can perform any setup or initialization here.
    }

    @Test
    public void testRetrieveAllUniversites() {
        List<Universite> universites = universiteService.retrieveAllUniversites();
        assertNotNull(universites);
    }

    @Test
    public void testAddUniversite() throws ParseException{
        // Create a sample Universite object
        Universite universite = new Universite();
        universite.setName("Sample Universite Name");
        universite.setLocation("Sample Location");

        // Add the Universite using the service
        Universite addedUniversite = universiteService.addUniversite(universite);

        // Assert that the addedUniversite is not null
        assertNotNull(addedUniversite);

        // Assert that the ID of the addedUniversite is not null
        assertNotNull(addedUniversite.getId());

        // You can also log information for debugging or tracking
        log.info("Added Universite: " + addedUniversite);

        // Clean up: Delete the added Universite
        universiteService.deleteUniversite(addedUniversite.getId());
    }

    @Test
    public void testUpdateUniversite() {
        // Create a sample Universite object
        Universite universite = new Universite();
        universite.setName("Sample Universite Name");
        universite.setLocation("Sample Location");

        // Add the Universite using the service
        Universite addedUniversite = universiteService.addUniversite(universite);

        // Modify the added Universite
        addedUniversite.setName("Updated Universite Name");
        Universite updatedUniversite = universiteService.updateUniversite(addedUniversite);

        // Assert that the updatedUniversite is not null
        assertNotNull(updatedUniversite);

        // You can add more assertions as needed
        assertEquals("Updated Universite Name", updatedUniversite.getName());

        // Clean up: Delete the added Universite
        universiteService.deleteUniversite(updatedUniversite.getId());
    }

    @Test
    public void testRetrieveUniversite() {
        // Create a sample Universite object
        Universite universite = new Universite();
        universite.setName("Sample Universite Name");
        universite.setLocation("Sample Location");

        // Add the Universite using the service
        Universite addedUniversite = universiteService.addUniversite(universite);

        // Retrieve the added Universite by ID
        Universite retrievedUniversite = universiteService.retrieveUniversite(addedUniversite.getId());

        // Assert that the retrievedUniversite is not null
        assertNotNull(retrievedUniversite);

        // Clean up: Delete the added Universite
        universiteService.deleteUniversite(retrievedUniversite.getId());
    }

    @Test
    public void testDeleteUniversite() {
        // Create a sample Universite object
        Universite universite = new Universite();
        universite.setName("Sample Universite Name");
        universite.setLocation("Sample Location");

        // Add the Universite using the service
        Universite addedUniversite = universiteService.addUniversite(universite);

        // Delete the added Universite
        universiteService.deleteUniversite(addedUniversite.getId());

        // Attempt to retrieve the deleted Universite
        Universite deletedUniversite = universiteService.retrieveUniversite(addedUniversite.getId());

        // Assert that the deletedUniversite is null
        assertNull(deletedUniversite);
    }

    @Test
    public void testAssignUniversiteToDepartement() {
        // Create a sample Universite and Departement
        Universite universite = new Universite();
        universite.setName("Sample Universite Name");
        universite.setLocation("Sample Location");

        Departement departement = new Departement();
        departement.setName("Sample Departement Name");

        // Add the Universite and Departement using the service
        Universite addedUniversite = universiteService.addUniversite(universite);
        Departement addedDepartement = departementService.addDepartement(departement);

        // Assign the Departement to the Universite
        universiteService.assignUniversiteToDepartement(addedUniversite.getId(), addedDepartement.getId());

        // Retrieve the Universite's Departements and check if the addedDepartement is present
        Set<Departement> universiteDepartements = universiteService.retrieveDepartementsByUniversite(addedUniversite.getId());

        assertNotNull(universiteDepartements);
        assertTrue(universiteDepartements.contains(addedDepartement));

        // Clean up: Delete the added Universite and Departement
        universiteService.deleteUniversite(addedUniversite.getId());
        departementService.deleteDepartement(addedDepartement.getId());
    }

    @Test
    public void testRetrieveDepartementsByUniversite() {
        // Create a sample Universite and add it
        Universite universite = new Universite();
        universite.setName("Sample Universite Name");
        universite.setLocation("Sample Location");

        Universite addedUniversite = universiteService.addUniversite(universite);

        // Retrieve the Universite's Departements and ensure it's not null
        Set<Departement> universiteDepartements = universiteService.retrieveDepartementsByUniversite(addedUniversite.getId());
        assertNotNull(universiteDepartements);

        // Clean up: Delete the added Universite
        universiteService.deleteUniversite(addedUniversite.getId());
    }

    // You can write more test methods for other service methods in a similar manner.

}

*/