package entities;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class EstudianteController {
	@Autowired
    private EstudianteService service;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> list() {
	    return service.listAll();
	}
	
	@GetMapping("/estudiantes/{id}")
	public ResponseEntity<Estudiante> get(@PathVariable Integer id) {
	    try {
	        Estudiante estudiante = service.get(id);
	        return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/estudiantes")
	public void add(@RequestBody Estudiante estudiante) {
	    service.save(estudiante);
	}
	
	@PutMapping("/estudiantes/{id}")
	public ResponseEntity<?> update(@RequestBody Estudiante estudiante, @PathVariable Integer id) {
	    try {
	        Estudiante existEstudiante = service.get(id);
	        service.save(estudiante);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@DeleteMapping("/estudiantes/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
}
