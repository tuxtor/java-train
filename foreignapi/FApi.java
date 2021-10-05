import jdk.incubator.foreign.LibraryLookup;

public class FApi {
    LibraryLookup libclang = LibraryLookup.ofLibrary("clang");
LibraryLookup.Symbol clangVersion = libclang.lookup("clang_getClangVersion");
}
