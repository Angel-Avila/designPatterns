package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Size;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by lamos on 9/29/2016.
 */
public class QuesadillaTest {
    @Test
    public void testCost() {
        Taco taco = new Quesadilla();
        assertEquals(10.0, taco.cost(), 0);
    }

    @Test
    public void TestCostDescRegularMaizQuesoPescado() throws Exception {
    Taco taco = new Quesadilla(Size.REGULAR);
        taco =  new Queso(taco);
        taco = new TortillaMaiz(taco);
        taco = new Pescado(taco);
        assertEquals("Quesadilla regular con queso en tortilla de maíz de pescado", taco.getDescription());
        assertEquals(18.0, taco.cost(), 0);

    }
    @Test
    public void TestCostDescMegaConTododeCamaronDeMaiz() throws Exception {
        Taco taco = new Quesadilla(Size.MEGA);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Camaron(taco);
        assertEquals("Quesadilla mega con queso con cilantro con cebolla en tortilla de harina de Camaron", taco.getDescription());
        assertEquals(30.0, taco.cost(), 0);

    }
    @Test
    public void TestCostDescregularConTododeCamaronDeMaiz() throws Exception {
        Taco taco = new Quesadilla(Size.REGULAR);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Camaron(taco);
        assertEquals("Quesadilla regular con queso con cilantro con cebolla en tortilla de harina de Camaron", taco.getDescription());
        assertEquals(21.0, taco.cost(), 0);

    }
    @Test
    public void TestCostDescMiniBistecConTodo() {
        Taco taco = new Quesadilla(Size.MINI);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Bistec(taco);
        assertEquals("Quesadilla mini con queso con cilantro con cebolla en tortilla de harina de bistec", taco.getDescription());
        assertEquals(17.0, taco.cost(), 0);

    }
    @Test
    public void TestCostDescRegularConTodoLengua() {
        Taco taco = new Quesadilla(Size.REGULAR);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Lengua(taco);
        assertEquals("Quesadilla regular con queso con cilantro con cebolla en tortilla de harina de lengua", taco.getDescription());
        assertEquals(25.0, taco.cost(), 0);

    }
    @Test
    public void TestCostDescMegaConTodoPastor() {
        Taco taco = new Quesadilla(Size.MEGA);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        assertEquals("Quesadilla mega con queso con cilantro con cebolla en tortilla de harina de pastor", taco.getDescription());
        assertEquals(32.0, taco.cost(), 0);

    }
    @Test
    public void TestCostDescMiniConTodoPastor() {
        Taco taco = new Quesadilla(Size.MINI);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        assertEquals("Quesadilla mini con queso con cilantro con cebolla en tortilla de harina de pastor", taco.getDescription());
        assertEquals(15.0, taco.cost(), 0);
    }
    @Test
    public void TestCostDescMiniConTododeChorizo(){
        Taco taco = new Quesadilla(Size.MINI);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        assertEquals("Quesadilla mini con queso con cilantro con cebolla en tortilla de maíz de chorizo", taco.getDescription());
        assertEquals(11.0, taco.cost(), 0);

    }

    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void testMiniPescadoNoExiste() throws Exception {
        try {
            Taco taco = new Quesadilla(Size.MINI);
            taco = new Pescado(taco);
            taco = new TortillaMaiz(taco);



            fail("Se espera falla por pescado y mini");
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"no existe el taco de pescado mini"  );
        }

        //  thrown.expect(Exception.class);
        //thrown.expectMessage("no existe el taco de pescado mini");//("Taco normal mega de pescado en tortilla de maiz", taco.getDescription());
        //  assertEquals(19.0, taco.cost(), 0);
    }

    @Test
    public void testMiniCamaronNoExiste() throws Exception {
        try {
            Taco taco = new Quesadilla(Size.MINI);
            taco = new Camaron(taco);
            taco = new TortillaMaiz(taco);

            fail("Se espera falla por camaron y mini");
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"no existe el taco de camaron mini");
        }

    }
}
