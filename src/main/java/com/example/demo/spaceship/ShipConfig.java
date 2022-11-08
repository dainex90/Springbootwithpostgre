package com.example.demo.spaceship;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ShipConfig {

    @Bean
    CommandLineRunner commandLineRunner(SpaceShipRepository repo)
    {
        return args -> {
            Spaceship orionZ22 = new Spaceship("Orion-Z22",
                    "Circling around the Orion Cluster",
                    LocalDate.of(2139, Month.JANUARY, 3),
                    780.0,
                    10);

            Spaceship nexusY7 = new Spaceship("Nexus-Y7",
                                "can travel long distance in short time!",
                    LocalDate.of(2143, Month.NOVEMBER, 11),
                    555.0,
                    14);

            Spaceship valerOmnix = new Spaceship("Valer-Omnix",
                                    "Probably circulating around Valerian Nebula",
                                    LocalDate.of(2098, Month.DECEMBER, 15),
                                    449.0,
                                    7);

            Spaceship zeusStatr = new Spaceship("Zeus-Statr",
                    " acts like a operational leader for other smaller T-Ships",
                    LocalDate.of(2105, Month.MAY, 12),
                    969.0,
                    23);

            Spaceship azerX40 = new Spaceship("Azer-X40",
                    "Small ship, but has plenty of computers aboard",
                    LocalDate.of(2120, Month.MARCH, 9),
                    980.0,
                    4);

            Spaceship anorZB7 = new Spaceship("Anor-ZB7",
                    "N/A",
                    LocalDate.of(2188, Month.DECEMBER, 28),
                    1020.0,
                    9);

            Spaceship marexAtlantica = new Spaceship("Marex-Atlantica",
                    "Huge ship with many travelers aboard, next up is Earth",
                    LocalDate.of(2151, Month.JUNE , 23),
                    900.0,
                    100);

            Spaceship stasisCloud9 = new Spaceship("Stasis-Cloud9",
                    "Will be off circuit very soon",
                    LocalDate.of(2078, Month.AUGUST, 27),
                    590.0,
                    20);

            Spaceship azteca = new Spaceship("Azteca",
                    "Got badly damaged after last patrol",
                    LocalDate.of(2109, Month.JULY , 1),
                    999.0,
                    32);

            Spaceship newHorizon = new Spaceship("New-Horizon",
                    "Currently stranded on Mars",
                    LocalDate.of(2078, Month.SEPTEMBER, 7),
                    808.0,
                    5);


            repo.saveAll(List.of(orionZ22, nexusY7, valerOmnix, zeusStatr,
                    azerX40, anorZB7, marexAtlantica, stasisCloud9, azteca, newHorizon));
        };


    }
}
