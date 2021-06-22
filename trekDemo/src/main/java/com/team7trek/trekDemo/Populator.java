package com.team7trek.trekDemo;

import com.team7trek.trekDemo.models.Continent;
import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.models.Trek;
import com.team7trek.trekDemo.repositories.ContinentRepository;
import com.team7trek.trekDemo.repositories.RegionRepository;
import com.team7trek.trekDemo.repositories.TrekRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private TrekRepository trekRepo;

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {
        Continent northAmerica = new Continent("North America", "title", "im");
        Continent southAmerica = new Continent("South America", "title", "image");
        Continent europe = new Continent("Europe", "title", "image");
        Continent asia = new Continent("Asia", "title", "image");
        Continent antarctica = new Continent("Antarctica", "title", "image");
        Continent africa = new Continent("Africa", "title", "/images/roya-climbing.jpg");
        Continent australia = new Continent("Australia", "title", "image");


        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(antarctica);
        continentRepo.save(africa);
        continentRepo.save(australia);

        Region northAmerica1 = new Region("NorthAmerica1", "./images/sourabh.jpg", "climate", northAmerica);
        Region northAmerica2 = new Region("NorthAmerica2", "image", "climate", northAmerica);
        Region southAmerica2 = new Region("SouthAmerica1", "image", "climate", southAmerica);
        Region southAmerica1 = new Region("SouthAmerica2", "image", "climate", southAmerica);
        Region europe1 = new Region("Europe1", "image", "climate", europe);
        Region europe2 = new Region("Europe2", "image", "climate", europe);
        Region asia1 = new Region("Asia1", "image", "climate", asia);
        Region asia2 = new Region("Asia2", "image", "climate", asia);
        Region antarctica1 = new Region("Ant1", "image", "climate", antarctica);
        Region antarctica2 = new Region("Ant2", "image", "climate", antarctica);
        Region africa1 = new Region("Africa1", "images", "climate", africa);
        Region africa2 = new Region("Africa2", "image", "climate", africa);
        Region australia1 = new Region("Australia1", "images", "climate", australia);
        Region australia2 = new Region("Australia2", "image", "climate", australia);


        regionRepo.save(northAmerica1);
        regionRepo.save(northAmerica2);
        regionRepo.save(southAmerica1);
        regionRepo.save(southAmerica2);
        regionRepo.save(europe1);
        regionRepo.save(europe2);
        regionRepo.save(asia1);
        regionRepo.save(asia2);
        regionRepo.save(antarctica1);
        regionRepo.save(antarctica2);
        regionRepo.save(africa1);
        regionRepo.save(africa2);
        regionRepo.save(australia1);
        regionRepo.save(australia2);

        Trek na1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", northAmerica, northAmerica1);
        Trek na2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", northAmerica, northAmerica1);
        Trek na3 = new Trek("title3", "difficulty", "description", "review", "./images/roya-climbing.jpg", northAmerica, northAmerica2);
        Trek na4 = new Trek("title4", "difficulty", "description", "review", "./images/roya-climbing.jpg", northAmerica, northAmerica2);
        Trek sa1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", southAmerica, southAmerica1);
        Trek sa2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", southAmerica, southAmerica1);
        Trek sa3 = new Trek("title3", "difficulty", "description", "review", "./images/roya-climbing.jpg", southAmerica, southAmerica2);
        Trek sa4 = new Trek("title4", "difficulty", "description", "review", "./images/roya-climbing.jpg", southAmerica, southAmerica2);
        Trek e1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", europe, europe1);
        Trek e2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", europe, europe1);
        Trek e3 = new Trek("title3", "difficulty", "description", "review", "./images/roya-climbing.jpg", europe, europe2);
        Trek e4 = new Trek("title4", "difficulty", "description", "review", "./images/roya-climbing.jpg", europe, europe2);
        Trek a1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", asia, asia1);
        Trek a2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", asia, asia1);
        Trek a3 = new Trek("title3", "difficulty", "description", "review", "./images/roya-climbing.jpg", asia, asia2);
        Trek a4 = new Trek("title4", "difficulty", "description", "review", "./images/roya-climbing.jpg", asia, asia2);
        Trek ant1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", antarctica, antarctica1);
        Trek ant2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", antarctica, antarctica1);
        Trek ant3 = new Trek("title3", "difficulty", "description", "review", "./images/roya-climbing.jpg", antarctica, antarctica2);
        Trek ant4 = new Trek("title4", "difficulty", "description", "review", "./images/roya-climbing.jpg", antarctica, antarctica2);
        Trek af1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", africa, africa1);
        Trek af2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", africa, africa1);
        Trek af3 = new Trek("title3", "difficulty", "description", "review", "./images/roya-climbing.jpg", africa, africa2);
        Trek af4 = new Trek("title4", "difficulty", "description", "review", "./images/roya-climbing.jpg", africa, africa2);
        Trek aus1 = new Trek("title1", "difficulty", "description", "review", "./images/roya-climbing.jpg", australia, australia1);
        Trek aus2 = new Trek("title2", "difficulty", "description", "review", "./images/roya-climbing.jpg", australia, australia1);
        Trek aus3 = new Trek("title3", "difficulty", "description", "review", "./images/sole-bicycle.jpg", australia, australia2);
        Trek aus4 = new Trek("title4", "difficulty", "description", "review", "./images/sole-bicycle.jpg", australia, australia2);

        trekRepo.save(na1);
        trekRepo.save(na2);
        trekRepo.save(na3);
        trekRepo.save(na4);
        trekRepo.save(sa1);
        trekRepo.save(sa2);
        trekRepo.save(sa3);
        trekRepo.save(sa4);
        trekRepo.save(e1);
        trekRepo.save(e2);
        trekRepo.save(e3);
        trekRepo.save(e4);
        trekRepo.save(a1);
        trekRepo.save(a2);
        trekRepo.save(a3);
        trekRepo.save(a4);
        trekRepo.save(ant1);
        trekRepo.save(ant2);
        trekRepo.save(ant2);
        trekRepo.save(ant3);
        trekRepo.save(ant4);
        trekRepo.save(af1);
        trekRepo.save(af2);
        trekRepo.save(af3);
        trekRepo.save(af4);
        trekRepo.save(aus1);
        trekRepo.save(aus2);
        trekRepo.save(aus3);
        trekRepo.save(aus4);
    }}
