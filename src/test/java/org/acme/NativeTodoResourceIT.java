package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeTodoResourceIT extends TodoResourceIT {

    // Execute the same tests but in native mode.
}