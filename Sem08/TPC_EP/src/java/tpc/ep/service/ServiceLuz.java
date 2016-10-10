package tpc.ep.service;

import tpc.ep.model.Item;

/**
 *
 * @author alumno
 */
public class ServiceLuz {

    public int Consumo(Item model) {
        int consu = model.getActual() - model.getAnterior();
        return consu;
    }

    public void procesar(Item model) {
        double consumo = Consumo(model);
        double total = 0.0;
        if (consumo == 500) {
            total = consumo * 0.70;
        } else if (consumo > 500 && consumo <= 1000) {
            total = (500 * 0.70) + ((consumo - 500) * 0.85);
        } else if (consumo > 1000 && consumo <= 1500) {
            total = (500 * 0.70) + (500 * 0.85) + ((consumo - 1000) * 1.15);
        } else if (consumo > 1500 && consumo <= 2000) {
            total = (500 * 0.70) + (500 * 0.85) + (500 * 1.15) + ((consumo - 1500) * 1.50);
        } else if (consumo > 2000) {
            total = (500 * 0.70) + (500 * 0.85) + (500 * 1.15) + (500 * 1.50) + ((consumo - 2000));
        }
        model.setConsumo(consumo);
        model.setTotal(total);
    }

}
