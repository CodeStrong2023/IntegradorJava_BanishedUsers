package domain;

import java.io.IOException;

// Para la animación de inicio usamos el paquete IOexception para la linea del sout
// Tarde 120 milisegundos en imprimir, esto genera una animacion como de cascada.
public class AnimacionInicio {
    public static void AnimacionInicio() throws InterruptedException, IOException {
        System.out.print("    _________    __    _______   ______  ___    ____  ________     ____   ______   ____  ___________ _________       \n");
        Thread.sleep(120);
	System.out.print("   / ____/   |  / /   / ____/ | / / __ \\/   |  / __ \\/  _/ __ \\  / ___  \\/ ____/  / __ \\/ ____/ ___// ____/   |      \n");
        Thread.sleep(120);
	System.out.print("  / /   / /| | / /   / __/ /  |/ / / / / /| | / /_/ // // / / / / /  / /  __/    / /_/ / __/  \\__ \\/ /   / /| |      \n");
        Thread.sleep(120);
        System.out.print(" / /___/ ___ |/ /___/ /___/ /|  / /_/ / ___ |/ _, _// // /_/ / / /__/ / /___    / ____/ /___ ___/ / /___/ ___ |      \n");
        Thread.sleep(120);
	System.out.print(" \\____/_/  |_/_____/_____/_/ |_/_____/_/  |_/_/ |_/___/\\____/ / ____ / _____/  /_/   /_____//____/\\____/_/  |_|      \n");
        Thread.sleep(120);
	System.out.print("");
        Thread.sleep(120);
	System.out.print("    ____   ____ ___  _____               /¨*._         _    \n");
        Thread.sleep(120);
	System.out.print("   |__ \\  / __ \\__ \\|__  /           .-*¨`    `*-.._.-¨/                                                				 \n");
        Thread.sleep(120);
	System.out.print("    __/ // / / /_/ / /_ <          < * ))     ,       (                                                               \n");
        Thread.sleep(120);
	System.out.print("   / __// /_/ / __/___/ /            `*-._`._(__.--*¨`.\\                                                              \n");
        Thread.sleep(120);
	System.out.print("  /____/\\____/____/____/                                                                                              \n");
        Thread.sleep(120);
        System.out.println("");
        System.out.println("                                                   Bienvenid@ al Calendario de Pesca");
	System.out.println("                                                                 2023!");
	//
    }
}


