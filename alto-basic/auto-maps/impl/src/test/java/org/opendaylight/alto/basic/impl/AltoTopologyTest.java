/*
 * Copyright © 2015 Yale University and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.alto.basic.impl;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AltoTopologyTest {
    private AltoTopology topology;

    @Before
    public void loadTopology() {
        topology = new AltoTopology();

        topology.addNode(0L, 673720322L);
        topology.addNode(0L, 168430088L);
        topology.addNode(0L, 168430089L);
        topology.addNode(0L, 168430087L);
        topology.addNode(0L, 168430084L);
        topology.addNode(0L, 168430089L);
        topology.addNode(0L, 168430088L);
        topology.addNode(2L, 168430091L);
        topology.addNode(1L, 168430085L);
        topology.addNode(0L, 168430083L);
        topology.addNode(1L, 168430086L);
        topology.addNode(0L, 168430082L);
        topology.addNode(2L, 168430088L);
        topology.addNode(0L, 168430087L);
        topology.addNode(0L, 168430084L);
        topology.addNode(0L, 673720322L);
        topology.addNode(1L, 168430084L);
        topology.addNode(1L, 168430081L);
        topology.addNode(0L, 168430082L);
        topology.addNode(1L, 168430082L);
        topology.addNode(0L, 168430083L);

        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAgEDAAQdHR0CAQQABB0dHQE=", 0L, 168430089L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAwEDAAQnJycCAQQABCcnJwE=", 0L, 168430089L, 168430083L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAAQdHR0BAQQABB0dHQI=", 0L, 168430082L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCAEDAARZWVkCAQQABFlZWQE=", 0L, 168430089L, 168430088L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEDAAQtLS0CAQQABC0tLQE=", 1L, 168430085L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAAQnJycBAQQABCcnJwI=", 0L, 168430083L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAICAwAECgoKCwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAICAwAECgoKCAEDAARRUVECAQQABFFRUQE=", 2L, 168430091L, 168430088L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARZWVkBAQQABFlZWQI=", 0L, 168430088L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEDAAQODg4BAQQABA4ODgI=", 1L, 168430081L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBwEDAARPT08CAQQABE9PTwE=", 0L, 168430089L, 168430087L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAwEDAAQnJycCAQQABCcnJwE=", 0L, 168430089L, 168430083L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEDAARaWloBAQQABFpaWgI=", 0L, 168430089L, 673720322L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBAEDAAQoKCgCAQQABCgoKAE=", 0L, 673720322L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEDAAQoKCgBAQQABCgoKAI=", 0L, 168430084L, 673720322L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAICAwAECgoKCAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAICAwAECgoKCwEDAARRUVEBAQQABFFRUQI=", 2L, 168430088L, 168430091L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARPT08BAQQABE9PTwI=", 0L, 168430087L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAAQnJycBAQQABCcnJwI=", 0L, 168430083L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBAEDAAQoKCgCAQQABCgoKAE=", 0L, 673720322L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARaWloCAQQABFpaWgE=", 0L, 673720322L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCAEDAARZWVkCAQQABFlZWQE=", 0L, 168430089L, 168430088L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEDAAQaGhoBAQQABBoaGgI=", 1L, 168430086L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEDAARaWloBAQQABFpaWgI=", 0L, 168430089L, 673720322L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEDAAQoKCgBAQQABCgoKAI=", 0L, 168430084L, 673720322L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBwEDAARPT08CAQQABE9PTwE=", 0L, 168430089L, 168430087L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEDAAQuLi4CAQQABC4uLgE=", 1L, 168430086L, 168430084L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEDAAQtLS0BAQQABC0tLQI=", 1L, 168430084L, 168430085L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKBwEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARPT08BAQQABE9PTwI=", 0L, 168430087L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEDAAQaGhoCAQQABBoaGgE=", 1L, 168430082L, 168430086L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARZWVkBAQQABFlZWQI=", 0L, 168430088L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAEKCgoAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAARaWloCAQQABFpaWgE=", 0L, 673720322L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAACAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAgEDAAQdHR0CAQQABB0dHQE=", 0L, 168430089L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEDAAQZGRkBAQQABBkZGQI=", 1L, 168430082L, 168430085L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEDAAQZGRkCAQQABBkZGQE=", 1L, 168430085L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEDAAQODg4CAQQABA4ODgE=", 1L, 168430084L, 168430081L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBAEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKBgEDAAQuLi4BAQQABC4uLgI=", 1L, 168430084L, 168430086L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEDAAQMDAwBAQQABAwMDAI=", 1L, 168430081L, 168430082L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAACAwAECgoKCQEDAAQdHR0BAQQABB0dHQI=", 0L, 168430082L, 168430089L);
        topology.addLink("AAIAYQMAAAAAAAAABAEAACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAgEBACACAAAEAAAAZAIBAAQAAAAAAgIABAAAAAECAwAECgoKAQEDAAQMDAwCAQQABAwMDAE=", 1L, 168430082L, 168430081L);

        topology.addIntraPrefix("1.1.1.0/24", 1L, 168430081L);
        topology.addIntraPrefix("5.5.5.0/24", 1L, 168430085L);
        topology.addIntraPrefix("6.6.6.0/24", 1L, 168430086L);
        topology.addIntraPrefix("4.4.4.0/24", 1L, 168430084L);
        topology.addIntraPrefix("11.11.11.0/24", 2L, 168430091L);
        topology.addIntraPrefix("8.8.8.0/24", 2L, 168430088L);

        topology.addInterPrefix("1.1.1.0/24", 0L, 168430082L, 2L);
        topology.addInterPrefix("1.1.1.0/24", 0L, 168430082L, 2L);
        topology.addInterPrefix("1.1.1.0/24", 0L, 168430084L, 2L);
        topology.addInterPrefix("1.1.1.0/24", 0L, 168430084L, 2L);
        topology.addInterPrefix("1.1.1.0/24", 2L, 168430088L, 4L);
        topology.addInterPrefix("5.5.5.0/24", 0L, 168430082L, 2L);
        topology.addInterPrefix("5.5.5.0/24", 0L, 168430082L, 2L);
        topology.addInterPrefix("5.5.5.0/24", 0L, 168430084L, 2L);
        topology.addInterPrefix("5.5.5.0/24", 0L, 168430084L, 2L);
        topology.addInterPrefix("5.5.5.0/24", 2L, 168430088L, 4L);
        topology.addInterPrefix("6.6.6.0/24", 0L, 168430082L, 2L);
        topology.addInterPrefix("6.6.6.0/24", 0L, 168430082L, 2L);
        topology.addInterPrefix("6.6.6.0/24", 0L, 168430084L, 2L);
        topology.addInterPrefix("6.6.6.0/24", 0L, 168430084L, 2L);
        topology.addInterPrefix("6.6.6.0/24", 2L, 168430088L, 4L);
        topology.addInterPrefix("4.4.4.0/24", 0L, 168430082L, 3L);
        topology.addInterPrefix("4.4.4.0/24", 0L, 168430082L, 3L);
        topology.addInterPrefix("4.4.4.0/24", 0L, 168430084L, 1L);
        topology.addInterPrefix("4.4.4.0/24", 0L, 168430084L, 1L);
        topology.addInterPrefix("4.4.4.0/24", 2L, 168430088L, 4L);
        topology.addInterPrefix("8.8.8.0/24", 0L, 168430088L, 1L);
        topology.addInterPrefix("8.8.8.0/24", 0L, 168430088L, 1L);
        topology.addInterPrefix("8.8.8.0/24", 1L, 168430082L, 3L);
        topology.addInterPrefix("8.8.8.0/24", 1L, 168430084L, 4L);
        topology.addInterPrefix("11.11.11.0/24", 0L, 168430088L, 2L);
        topology.addInterPrefix("11.11.11.0/24", 0L, 168430088L, 2L);
        topology.addInterPrefix("11.11.11.0/24", 1L, 168430082L, 4L);
        topology.addInterPrefix("11.11.11.0/24", 1L, 168430084L, 5L);

        topology.buildDistance();
    }

    @Test
    public void getDistance() {
        int dist1 = topology.getDistance("4.4.4.0/24", "5.5.5.0/24");
        assertEquals(2, dist1);
        int dist2 = topology.getDistance("5.5.5.0/24", "1.1.1.0/24");
        assertEquals(3, dist2);
        String[] prefixes = {"1.1.1.0/24", "4.4.4.0/24", "5.5.5.0/24", "6.6.6.0/24", "8.8.8.0/24", "11.11.11.0/24"};
        System.out.println(topology.getDistance(2L, 168430088L, 168430088L));
        for (String src : prefixes) {
            for (String dst : prefixes) {
                int dist = topology.getDistance(Arrays.asList(src), Arrays.asList(dst));
                System.out.println(String.format("%s -> %s: %d", src, dst, dist));
            }
        }
    }
}