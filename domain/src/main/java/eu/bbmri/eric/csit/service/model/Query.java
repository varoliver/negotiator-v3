// Generated by delombok at Wed May 04 16:43:34 CEST 2022
package eu.bbmri.eric.csit.service.model;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Query")
@Table(name = "query")
@TypeDefs({ @TypeDef(name = "json", typeClass = JsonType.class) })
public class Query extends BaseEntity {

    @ManyToMany
    @JoinTable(name = "query_biobank_link", joinColumns = @JoinColumn(name = "biobank_id"), inverseJoinColumns = @JoinColumn(name = "query_id"))
    private Set<Biobank> biobanks;

    @ManyToMany
    @JoinTable(name = "query_collection_link", joinColumns = @JoinColumn(name = "collection_id"), inverseJoinColumns = @JoinColumn(name = "query_id"))
    private Set<Collection> collections;

    @Type(type = "json")
    @Column(columnDefinition = "jsonb")
    private String jsonPayload;

    private String queryToken;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id")
    private Request request;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "data_source_id")
    private DataSource dataSource;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Query(jsonPayload=" + this.getJsonPayload() + ", queryToken=" + this.getQueryToken() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public Query() {
    }

    @java.lang.SuppressWarnings("all")
    public Query(final Set<Biobank> biobanks, final Set<Collection> collections, final String jsonPayload, final String queryToken, final Request request,
            final DataSource dataSource) {
        this.biobanks = biobanks;
        this.collections = collections;
        this.jsonPayload = jsonPayload;
        this.queryToken = queryToken;
        this.request = request;
        this.dataSource = dataSource;
    }

    @java.lang.SuppressWarnings("all")
    public Set<Biobank> getBiobanks() {
        return this.biobanks;
    }

    @java.lang.SuppressWarnings("all")
    public Set<Collection> getCollections() {
        return this.collections;
    }

    @java.lang.SuppressWarnings("all")
    public String getJsonPayload() {
        return this.jsonPayload;
    }

    @java.lang.SuppressWarnings("all")
    public String getQueryToken() {
        return this.queryToken;
    }

    @java.lang.SuppressWarnings("all")
    public Request getRequest() {
        return this.request;
    }

    @java.lang.SuppressWarnings("all")
    public DataSource getDataSource() {
        return this.dataSource;
    }

    @java.lang.SuppressWarnings("all")
    public void setBiobanks(final Set<Biobank> biobanks) {
        this.biobanks = biobanks;
    }

    @java.lang.SuppressWarnings("all")
    public void setCollections(final Set<Collection> collections) {
        this.collections = collections;
    }

    @java.lang.SuppressWarnings("all")
    public void setJsonPayload(final String jsonPayload) {
        this.jsonPayload = jsonPayload;
    }

    @java.lang.SuppressWarnings("all")
    public void setQueryToken(final String queryToken) {
        this.queryToken = queryToken;
    }

    @java.lang.SuppressWarnings("all")
    public void setRequest(final Request request) {
        this.request = request;
    }

    @java.lang.SuppressWarnings("all")
    public void setDataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
