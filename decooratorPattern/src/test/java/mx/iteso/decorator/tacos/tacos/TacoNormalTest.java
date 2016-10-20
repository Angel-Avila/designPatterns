package mx.iteso.decorator.tacos.tacos;


import mx.iteso.decorator.Size;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TacoNormalTest {
    @Test
    public void testCost() {
        Taco taco = new TacoNormal();
        assertEquals(8.0, taco.cost(),0);
    }
    @Test
    public void testCostMegaBistecHarinaCebollaCilantroQueso() {
        Taco taco = new TacoNormal(Size.MEGA);
        taco = new Bistec(taco);
        taco = new TortillaHarina(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        taco = new Queso(taco);
        assertEquals("Taco normal mega de bistec en tortilla de harina con cebolla con cilantro con queso",
                taco.getDescription());
        assertEquals(29.0, taco.cost(), 0);
    }
    @Test
    public void TestCostDescMiniConTodoPastor() {
        Taco taco = new TacoNormal(Size.MINI);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        assertEquals("Taco normal mini con queso con cilantro con cebolla en tortilla de harina de pastor", taco.getDescription());
        assertEquals(13.0, taco.cost(), 0);
    }
    @Test
    public void TestCostDescRegularConTodoPastor() {
        Taco taco = new TacoNormal(Size.REGULAR);
        taco =  new Queso(taco);
        taco = new Cilantro(taco);
        taco = new Cebolla(taco);
        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        assertEquals("Taco normal regular con queso con cilantro con cebolla en tortilla de harina de pastor", taco.getDescription());
        assertEquals(19.0, taco.cost(), 0);
    }

    @Test
    public void testCostRegularChorizoMaizCebollaCilantroQueso() {
        Taco taco = new TacoNormal(Size.REGULAR);
        taco = new Chorizo(taco);
        taco = new TortillaMaiz(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        taco = new Queso(taco);
        assertEquals("Taco normal regular de chorizo en tortilla de maíz con cebolla con cilantro con queso",
                taco.getDescription());
        assertEquals(15.0, taco.cost(), 0);
    }

    @Test
    public void testCostMiniLenguaHarinaCebollaCilantroQueso() {
        Taco taco = new TacoNormal(Size.MINI);
        taco = new Lengua(taco);
        taco = new TortillaHarina(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        taco = new Queso(taco);
        assertEquals("Taco normal mini de lengua en tortilla de harina con cebolla con cilantro con queso",
                taco.getDescription());
        assertEquals(17.0, taco.cost(), 0);
    }

    @Test
    public void testCostRegularBistec() {
        Taco taco = new TacoNormal(Size.REGULAR);
        taco = new Bistec(taco);
        taco = new TortillaMaiz(taco);
        assertEquals("Taco normal regular de bistec en tortilla de maíz",
                taco.getDescription());
        assertEquals(15.0, taco.cost(), 0);
    }

    @Test
    public void testCostRegularLengua() {
        Taco taco = new TacoNormal(Size.REGULAR);
        taco = new Lengua(taco);
        taco = new TortillaMaiz(taco);
        assertEquals("Taco normal regular de lengua en tortilla de maíz",
                taco.getDescription());
        assertEquals(17.0, taco.cost(), 0);
    }

    @Test
    public void testCostMegaLengua() {
        Taco taco = new TacoNormal(Size.MEGA);
        taco = new Lengua(taco);
        taco = new TortillaMaiz(taco);
        assertEquals("Taco normal mega de lengua en tortilla de maíz",
                taco.getDescription());
        assertEquals(22.0, taco.cost(), 0);
    }

    @Test
    public void testCostMegaChorizo() {
        Taco taco = new TacoNormal(Size.MEGA);
        taco = new Chorizo(taco);
        taco = new TortillaMaiz(taco);
        assertEquals("Taco normal mega de chorizo en tortilla de maíz",
                taco.getDescription());
        assertEquals(18.0, taco.cost(), 0);
    }

    @Test
    public void testCostMiniChorizo() {
        Taco taco = new TacoNormal(Size.MINI);
        taco = new Chorizo(taco);
        taco = new TortillaMaiz(taco);
        assertEquals("Taco normal mini de chorizo en tortilla de maíz",
                taco.getDescription());
        assertEquals(8.0, taco.cost(), 0);
    }

    @Test
    public void testCostMiniBistec() {
        Taco taco = new TacoNormal(Size.MINI);
        taco = new Bistec(taco);
        taco = new TortillaMaiz(taco);
        assertEquals("Taco normal mini de bistec en tortilla de maíz",
                taco.getDescription());
        assertEquals(10.0, taco.cost(), 0);
    }
    @Test
    public void testCostharinaPescadoMEGAContodo() throws Exception {
        Taco taco = new TacoNormal(Size.MEGA);
        taco = new Pescado(taco);
        taco = new TortillaHarina(taco);
        assertEquals("Taco normal mega de pescado en tortilla de harina",
                taco.getDescription());
        assertEquals(23.0, taco.cost(), 0);
    }
    @Test
    public void testCostMaizPescadoRegularContodo() throws Exception {
        Taco taco = new TacoNormal(Size.REGULAR);
        taco = new Pescado(taco);
        taco = new TortillaMaiz(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        taco = new Queso(taco);
        assertEquals("Taco normal regular de pescado en tortilla de maíz con cebolla con cilantro con queso",
                taco.getDescription());
        assertEquals(16.0, taco.cost(), 0);
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void testMiniPescadoNoExiste() throws Exception {
        try {
            Taco taco = new TacoNormal(Size.MINI);
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
            Taco taco = new TacoNormal(Size.MINI);
            taco = new Camaron(taco);
            taco = new TortillaMaiz(taco);

            fail("Se espera falla por camaron y mini");
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"no existe el taco de camaron mini");
        }

    }
}
