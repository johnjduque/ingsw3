/*package com.uco.myproject.infraestructura.controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uco.myproject.aplicacion.dto.DtoPersona;
import com.uco.myproject.aplicacion.dto.DtoRespuesta;
import com.uco.myproject.dominio.puerto.RepositorioPersona;
import com.uco.myproject.infraestructura.ApplicationMock;
import com.uco.myproject.infraestructura.testdatabuilder.DtoPersonaTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = ApplicationMock.class)
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ControladorPersonaTest {


    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Autowired
    RepositorioPersona repositorioPersona;

    @Test
    @DisplayName("Debe crear una persona de forma exitosa y luego fallar al crear la misma")
    void crearDuplicadaTest() throws Exception {

        // arrange
        var dto = new DtoPersonaTestDataBuilder().build();

        crear(dto);

        // act - assert
        mocMvc.perform(MockMvcRequestBuilders.post("/api/personas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto))
                )
                .andExpect(status().isConflict());
    }


    @Test
    @DisplayName("Debe crear una persona de forma exitosa y validar que si quedó guardada")
    void crearTest() throws Exception {

        var dto = new DtoPersonaTestDataBuilder().build();

        crear(dto);
    }

    private void crear(DtoPersona dto) throws Exception {

        // arrange

        // act
        var result = mocMvc.perform(MockMvcRequestBuilders.post("/api/personas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto))
                )
                .andExpect(status().isOk())
                .andReturn();

        //assert
        var jsonResult = result.getResponse().getContentAsString();
        DtoRespuesta<Integer> respuesta = objectMapper.readValue(jsonResult, DtoRespuesta.class);

        Long id = respuesta.getValor().longValue();
        Assertions.assertNotNull(id);

        var persona = repositorioPersona.consultarPorId(Math.toIntExact(id));

        Assertions.assertEquals(dto.getDocumentoIdentidad(), persona.getDocumentoIdentidad());
        Assertions.assertEquals(dto.getPrimerNombre(), persona.getPrimerNombre());
        Assertions.assertEquals(dto.getSegundoNombre(), persona.getSegundoNombre());
        Assertions.assertEquals(dto.getPrimerApellido(), persona.getPrimerApellido());
        Assertions.assertEquals(dto.getSegundoApellido(), persona.getSegundoApellido());
        Assertions.assertEquals(dto.getFechaNacimiento(), persona.getFechaNacimiento());
        Assertions.assertEquals(dto.getIngresoMensual(), persona.getIngresoMensual());
    }

    @Test
    @DisplayName("Debe listar las personas luego de crearlas")
    void listarTest() throws Exception {

        var dto = new DtoPersonaTestDataBuilder().build();

        crear(dto);

        mocMvc.perform(get("/api/personas")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].documentoidentidad", is(dto.getDocumentoIdentidad())))
                .andExpect(jsonPath("$[0].primernombre", is(dto.getPrimerNombre())))
                .andExpect(jsonPath("$[0].segundonombre", is(dto.getSegundoNombre())))
                .andExpect(jsonPath("$[0].primerapellido", is(dto.getPrimerApellido())))
                .andExpect(jsonPath("$[0].segundoapellido", is(dto.getSegundoApellido())))
                .andExpect(jsonPath("$[0].fechanacimiento", is(dto.getFechaNacimiento())))
                .andExpect(jsonPath("$[0].ingresomensual", is(dto.getIngresoMensual())));
    }
}*/
