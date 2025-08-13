package com.example.product_catalog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories (basePackages = "one.digitalinnovation.experts.productcatalog.repository")
public class ElasticSearchConfig {


}
