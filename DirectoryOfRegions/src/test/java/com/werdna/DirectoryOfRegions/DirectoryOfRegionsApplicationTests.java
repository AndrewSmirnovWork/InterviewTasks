package com.werdna.DirectoryOfRegions;

import com.werdna.DirectoryOfRegions.entity.Region;
import com.werdna.DirectoryOfRegions.rest.RegionRestController;
import com.werdna.DirectoryOfRegions.service.RegionService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.mockito.Mockito.when;

@SpringBootTest
class DirectoryOfRegionsApplicationTests {

    @InjectMocks
    private RegionRestController regionRestController;

    @Mock
    private RegionService service;

    private Logger log = Logger.getLogger(getClass().getName());


    @Test
    void testFindAll() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        List<Region> regions = new ArrayList<>();
        regions.add(new Region(" udd", "dd"));
        regions.add(new Region(" asdasd", "ddasd"));
        System.out.println(regions);

        when(service.findAll()).thenReturn(regions);



        regionRestController.findAll();

    }


}
