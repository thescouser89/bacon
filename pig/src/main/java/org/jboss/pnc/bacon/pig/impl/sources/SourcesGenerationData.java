package org.jboss.pnc.bacon.pig.impl.sources;

import java.util.ArrayList;
import java.util.List;

import org.jboss.pnc.bacon.pig.impl.config.GenerationData;

import lombok.Data;

@Data
public class SourcesGenerationData extends GenerationData<SourcesGenerationStrategy> {

    /**
     * Each entry can be a part of an artifact If none are supplied, then it's assumed that sources from all artifacts
     * are to be added
     */
    private List<String> whitelistedArtifacts;

    private List<String> additionalExternalSources;

    private List<String> excludeSourceBuilds;

    private boolean oldBCNaming = false;

    /**
     * Add defaults to avoid having existing configurations having to define a sourceGeneration object in the flow
     * section
     */
    public SourcesGenerationData() {
        this.whitelistedArtifacts = new ArrayList<>();
        this.additionalExternalSources = new ArrayList<>();
        this.excludeSourceBuilds = new ArrayList<>();
        setStrategy(SourcesGenerationStrategy.GENERATE);
    }
}
