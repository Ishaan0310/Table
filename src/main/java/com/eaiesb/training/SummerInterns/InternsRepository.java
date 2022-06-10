package com.eaiesb.training.SummerInterns;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InternsRepository extends MongoRepository <Interns, String> {

}
