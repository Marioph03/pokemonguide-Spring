package com.example.pokemonguide.springboot.pokemonguide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.pokemonguide.springboot.pokemonguide.models.Generacion;
import com.example.pokemonguide.springboot.pokemonguide.models.Habilidad;
import com.example.pokemonguide.springboot.pokemonguide.models.Movimiento;
import com.example.pokemonguide.springboot.pokemonguide.models.Naturaleza;
import com.example.pokemonguide.springboot.pokemonguide.models.Pokemon;
import com.example.pokemonguide.springboot.pokemonguide.models.Tipo;
import com.example.pokemonguide.springboot.pokemonguide.repositories.GeneracionRepository;
import com.example.pokemonguide.springboot.pokemonguide.repositories.HabilidadRepository;
import com.example.pokemonguide.springboot.pokemonguide.repositories.MovimientoRepository;
import com.example.pokemonguide.springboot.pokemonguide.repositories.NaturalezaRepository;
import com.example.pokemonguide.springboot.pokemonguide.repositories.PokemonRepository;
import com.example.pokemonguide.springboot.pokemonguide.repositories.TipoRepository;
import com.example.pokemonguide.springboot.pokemonguide.services.PokemonService;

@SpringBootApplication
public class PokemonguideApplication implements CommandLineRunner {

    @Autowired
    private PokemonRepository pkmnRepository;

    @Autowired
    private GeneracionRepository genRepository;

    @Autowired
    private HabilidadRepository habRepository;

    @Autowired
    private NaturalezaRepository natRepository;

    @Autowired
    private TipoRepository tipoRepository;

    @Autowired
    private MovimientoRepository movRepository;

    public static void main(String[] args) {
        SpringApplication.run(PokemonguideApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PokemonService pkmnService() {
        return new PokemonService();
    }

    public void createPkmn() {
        // Asegúrate de que la generación existe
        Generacion generacion = genRepository.findById(1).orElseGet(() -> {
            // Crear nueva generación si no existe
            Generacion nuevaGeneracion = new Generacion();
            nuevaGeneracion.setNumGeneracion(1);
            ;
            nuevaGeneracion.setDescripcion("Primera Generacion");
            ;
            nuevaGeneracion.setNumPokemonPorGeneracion(151);
            return genRepository.save(nuevaGeneracion);
        });

        Habilidad habilidad = habRepository.findById("Elec.Estatica").orElseGet(() -> {
            Habilidad nuevaHabilidad = new Habilidad();
            nuevaHabilidad.setNombre("Elec.Estatica");
            nuevaHabilidad.setDescripcion("Paraliza al enemigo al minimo contacto fisico");
            return habRepository.save(nuevaHabilidad);
        });

        Naturaleza naturaleza = natRepository.findById("Huraña").orElseGet(() -> {
            Naturaleza nuevaNaturaleza = new Naturaleza();
            nuevaNaturaleza.setNombre("Huraña");
            nuevaNaturaleza.setEfecto("Aumenta el ataque y disminuye la defensa");
            return natRepository.save(nuevaNaturaleza);
        });

        Tipo tipo = tipoRepository.findById("Electrico").orElseGet(() -> {
            Tipo nuevoTipo = new Tipo();
            nuevoTipo.setNombre("Electrico");
            nuevoTipo.setDescripcion("Echa muchas chispas");
            nuevoTipo.setImagen(
                    "C:\\Users\\Mario\\Documents\\PokemonGuide\\pokemonguide\\src\\main\\resources\\imagenes\\Tipo_Electrico.png");
            return tipoRepository.save(nuevoTipo);
        });

        Tipo tipo2 = tipoRepository.findById("Normal").orElseGet(() -> {
            Tipo nuevoTipo = new Tipo();
            nuevoTipo.setNombre("Normal");
            nuevoTipo.setDescripcion("Tipo Normal");
            nuevoTipo.setImagen(
                    "C:\\Users\\Mario\\Documents\\PokemonGuide\\pokemonguide\\src\\main\\resources\\imagenes\\Tipo_Normal.jpg");
            return tipoRepository.save(nuevoTipo);
        });

        Movimiento movimiento = movRepository.findById("Placaje").orElseGet(() -> {
            Movimiento nuevoMov = new Movimiento();
            nuevoMov.setNombre("Placaje");
            nuevoMov.setDescripcion("Carga fisica que embiste contra el enemigo");
            nuevoMov.setGeneracion(generacion);
            nuevoMov.setTipo(tipo2);
            nuevoMov.setCategoria("Fisica");
            nuevoMov.setPotencia(40);
            nuevoMov.setPrecision(100);
            return movRepository.save(nuevoMov);
        });

        Movimiento movimiento2 = movRepository.findById("Impactrueno").orElseGet(() -> {
            Movimiento nuevoMov = new Movimiento();
            nuevoMov.setNombre("Impactrueno");
            nuevoMov.setDescripcion("Causa daño y tiene una probabilidad del 10% de paralizar al objetivo.");
            nuevoMov.setGeneracion(generacion);
            nuevoMov.setTipo(tipo);
            nuevoMov.setCategoria("Especial");
            nuevoMov.setPotencia(40);
            nuevoMov.setPrecision(100);
            return movRepository.save(nuevoMov);
        });

        List<Tipo> tipos = new ArrayList<Tipo>();
        tipos.add(tipo);

        List<Movimiento> movimientos = new ArrayList<Movimiento>();
        movimientos.add(movimiento);
        movimientos.add(movimiento2);

        //List<Pokemon> pokemonExistente = pkmnRepository.findByNombre("Pikachu");
        // Crear nuevo Pokémon
        Pokemon pokemon = new Pokemon();
        //if (pokemonExistente.isEmpty()) {
            pokemon.setNombre("Pikachu");
            pokemon.setDescripcion("Un Pokémon eléctrico");
            pokemon.setGeneracion(generacion);
            pokemon.setHabilidad(habilidad);
            pokemon.setImagen("https://i.pinimg.com/originals/df/bb/4c/dfbb4cefcf179b7b63ec93c74320de40.gif");
            pokemon.setPsBase(35);
            pokemon.setAtaqueBase(55);
            pokemon.setDefensaBase(40);
            pokemon.setAtaqueEspecialBase(50);
            pokemon.setDefensaEspecialBase(50);
            pokemon.setVelocidadBase(90);
            pokemon.setPsMaximo(274);
            pokemon.setAtaqueMaximo(209);
            pokemon.setDefensaMaximo(179);
            pokemon.setAtaqueEspecialMaximo(199);
            pokemon.setDefensaEspecialMaximo(199);
            pokemon.setVelocidadMaximo(279);
            pokemon.setIv(31);
            pokemon.setNivel(50);
            pokemon.setShiny(true);
            pokemon.setNumEvolucion(2);
            pokemon.setNaturaleza(naturaleza);
            pokemon.setListaTipos(tipos);
            pokemon.setMovimientos(Arrays.asList(movimiento, movimiento2));

            // Agregar tipos si no existen ya
            //List<Tipo> tiposs = new LinkedList<>();
            //tiposs.add(tipo);
            //pokemon.setListaTipos(tiposs);

            // Guardar Pokémon
            pkmnRepository.save(pokemon);
        //} else {
            // Actualizar Pokémon existente
            //pokemon = pokemonExistente.get(1);

            // Agregar tipos si no existen ya
            //if (!pokemon.getListaTipos().contains(tipo)) {
            //    pokemon.getListaTipos().add(tipo);
           // }

            // Guardar cambios en el Pokémon existente
            pkmnRepository.save(pokemon);
        //}
    }

    // Logica del buscador
    @Override
    public void run(String... args) throws Exception {
        //createPkmn();
    }

    public void findOne() {
        pkmnRepository.findById(1).ifPresent(pokemon -> System.out.println(pokemon));
    }

    public void list() {
        // List<Pokemon> pokemons = (List<Pokemon>) pkmnRepository.findAll();
        //List<Pokemon> pokemons = (List<Pokemon>) pkmnRepository.buscarByNombre("Geodude");

        // Se imprime cada pokemon de la lista
       // pokemons.stream().forEach(pokemon -> {
        //    System.out.println(pokemon);
        //});

        List<Object[]> pokemonsValues = pkmnRepository.obtenerPersonData("Geodude");
        pokemonsValues.stream().forEach(pokemon -> {
            System.out.println(pokemon[0] + " es experto en " + pokemon[1]);
        });
    }
}
