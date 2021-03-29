package com.funkyjimm.dogslibry.tools;

import com.funkyjimm.dogslibry.model.Classification;
import com.funkyjimm.dogslibry.model.Dog;
import com.funkyjimm.dogslibry.model.DogGroup;
import com.funkyjimm.dogslibry.model.Origin;
import com.funkyjimm.dogslibry.repositories.ClassificationRepository;
import com.funkyjimm.dogslibry.repositories.DogGroupRepository;
import com.funkyjimm.dogslibry.repositories.DogRepository;
import com.funkyjimm.dogslibry.repositories.OriginRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    private ClassificationRepository classificationRepository;
    private DogRepository dogRepository;
    private DogGroupRepository dogGroupRepository;
    private OriginRepository originRepository;

    public DBInflater(ClassificationRepository classificationRepository, DogRepository dogRepository, DogGroupRepository dogGroupRepository, OriginRepository originRepository) {
        this.classificationRepository = classificationRepository;
        this.dogRepository = dogRepository;
        this.dogGroupRepository = dogGroupRepository;
        this.originRepository = originRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        // Dogs organisations and their classifications
        Classification akcToyGroup = new Classification("AKC", "Toy");
        Classification akcHoundGroup = new Classification("AKC", "Hound");
        Classification akcTerrierGroup = new Classification("AKC", "Terrier");
        Classification akcWorkingGroup = new Classification("AKC", "Working");
        Classification akcNonSportingGroup = new Classification("AKC", "Non-Sporting");
        Classification akcSportingGroup = new Classification("AKC", "Sporting");
        Classification akcHerdingGroup = new Classification("AKC", "Herding");
        classificationRepository.save(akcToyGroup);
        classificationRepository.save(akcHoundGroup);
        classificationRepository.save(akcTerrierGroup);
        classificationRepository.save(akcWorkingGroup);
        classificationRepository.save(akcNonSportingGroup);
        classificationRepository.save(akcSportingGroup);
        classificationRepository.save(akcHerdingGroup);

        // Dogs groups and descriptions
        DogGroup group1 = new DogGroup("Grupa I", "Owczarki i inne psy pasterskie, z wyłączeniem szwajcarskich psów do bydła");
        DogGroup group2 = new DogGroup("Grupa II", "Pinczery i sznaucery, molosy, szwajcarskie psy górskie i do bydła, pozostałe rasy");
        DogGroup group3 = new DogGroup("Grupa III", "Teriery");
        DogGroup group4 = new DogGroup("Grupa IV", "Jamniki");
        DogGroup group5 = new DogGroup("Grupa V", "Szpice i psy w typie pierwotnym");
        DogGroup group6 = new DogGroup("Grupa VI", "Psy gończe i rasy pokrewne");
        DogGroup group7 = new DogGroup("Grupa VII", "Wyżły (psy wystawiające zwierzynę)");
        DogGroup group8 = new DogGroup("Grupa VIII", "Aportery, płochacze i psy dowodne");
        DogGroup group9 = new DogGroup("Grupa IX", "Psy ozdobne i do towarzystwa");
        DogGroup group10 = new DogGroup("Grupa X", "Charty");
        dogGroupRepository.save(group1);
        dogGroupRepository.save(group2);
        dogGroupRepository.save(group3);
        dogGroupRepository.save(group4);
        dogGroupRepository.save(group5);
        dogGroupRepository.save(group6);
        dogGroupRepository.save(group7);
        dogGroupRepository.save(group8);
        dogGroupRepository.save(group9);
        dogGroupRepository.save(group10);

        // Dogs origins and short details
        Origin japan = new Origin("Japonia", "Tokio");
        Origin poland = new Origin("Polska", "Warszawa");
        Origin germany = new Origin("Niemcy", "Berlin");
        originRepository.save(japan);
        originRepository.save(poland);
        originRepository.save(germany);

        // Dogs breeds
        Dog akita = new Dog("Akita", group5, 71, 45, japan, "Rasa psa zaliczana do grupy szpiców i psów pierwotnych. Wyhodowana w Japonii pierwotnie do walk psów, później użytkowana również do polowań. Współcześnie pełni funkcje psa stróżująco-obronnego oraz psa do towarzystwa. Jest to największa rasa spośród ras japońskich. Nie podlega próbom pracy.");
        dogRepository.save(akita);

    }
}
