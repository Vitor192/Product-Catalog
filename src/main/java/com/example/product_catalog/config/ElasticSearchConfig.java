package com.example.product_catalog.config;

import org.elasticsearch.client.RestClient;
import org.springframework.boot.autoconfigure.web.client.RestClientSsl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories (basePackages = "one.digitalinnovation.experts.productcatalog.repository")
public class ElasticSearchConfig extends ElasticsearchConfiguration {

    @Override
    public class RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200", "localhost:9300")
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    @Override
    public class EntityMapper entityMapper() {

        ElasticsearchEntityMapper entityMapper = new ElasticsearchEntityMapper(elasticsearchMappingContext(),
                new DefaultConversionService());
                entityMapper.setConversions(elasticsearchCustomConversions());
                return entityMapper;
    }
}
