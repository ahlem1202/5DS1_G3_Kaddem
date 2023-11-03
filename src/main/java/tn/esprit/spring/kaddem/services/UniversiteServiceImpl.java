package tn.esprit.spring.kaddem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.entities.Universite;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;
import tn.esprit.spring.kaddem.repositories.UniversiteRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UniversiteServiceImpl implements IUniversiteService {
    @Autowired
    UniversiteRepository universiteRepository;
    @Autowired
    DepartementRepository departementRepository;

    public UniversiteServiceImpl() {
        // This is an empty constructor with no specific task.
    }

    public List<Universite> retrieveAllUniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }

    public Universite addUniversite(Universite u) {
        return (universiteRepository.save(u));
    }

    public Universite updateUniversite(Universite u) {
        return (universiteRepository.save(u));
    }

    public Universite retrieveUniversite(Integer idUniversite) {
        Optional<Universite> optionalUniversite = universiteRepository.findById(idUniversite);

        if (optionalUniversite.isPresent()) {
            Universite u = optionalUniversite.get();
            return u;
        } else {
            // Handle the case where the university with the given ID is not found.
            // You can log an error or throw an exception, depending on your error-handling strategy.
            return null; // Or throw an exception if you prefer.
        }
    }


    public void deleteUniversite(Integer idUniversite) {
        universiteRepository.delete(retrieveUniversite(idUniversite));
    }

    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite u = universiteRepository.findById(idUniversite).orElse(null);
        Departement d = departementRepository.findById(idDepartement).orElse(null);
        if (u != null && d != null) {
            u.getDepartements().add(d);
            universiteRepository.save(u);
        } else {
            // Handle the case where either the university or department is not found.
            // You can log an error or throw an exception, depending on your error-handling strategy.
        }

    }

    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite u = universiteRepository.findById(idUniversite).orElse(null);
        if (u != null) {
            return u.getDepartements();
        } else {
            // Handle the case where the university is not found.
            // You can log an error or throw an exception, depending on your error-handling strategy.
            return null; // Or return an empty set if you prefer.
        }
    }
}
