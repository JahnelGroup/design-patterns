package com.jahnelgroup.formatadapter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.jahnelgroup.videoplayer.Flv;
import com.jahnelgroup.videoplayer.Mp4;
import com.jahnelgroup.visualplayer.Wmv;

public class FormatAdapterTests {

    /*
     * This tests revolves around showing that the FormatAdapter is able to play VisualPlayer with the VideoPlayer's playVideo method.
     * 
     */
    @Test
    public void shouldPlayWithAllFileFormats() {
        List<String> outputs = Arrays.asList(new Mp4(), 
                                             new Flv(), 
                                             new FormatAdapter(new Wmv()))
                                     .stream()
                                     .map(format -> format.playVideo("VideoName"))
                                     .collect(Collectors.toList());
        assertThat(outputs).containsExactlyInAnyOrder("Playing MP4: VideoName", 
                                                      "Playing FLV: VideoName", 
                                                      "The WMV video VideoName is playing.");
        
    }

}
