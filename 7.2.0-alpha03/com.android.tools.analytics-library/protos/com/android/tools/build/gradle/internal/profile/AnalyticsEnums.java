// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analytics_enums.proto

package com.android.tools.build.gradle.internal.profile;

public final class AnalyticsEnums {
  private AnalyticsEnums() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025analytics_enums.proto*\337\013\n\034GradleTransf" +
      "ormExecutionType\022\032\n\026UNKNOWN_TRANSFORM_TY" +
      "PE\020\000\022\007\n\003DEX\020\001\022\032\n\026EXTRACT_JARS_TRANSFORM\020" +
      "\002\022\023\n\017INSTANT_RUN_DEX\020\003\022\026\n\022INSTANT_RUN_SL" +
      "ICER\020\004\022\031\n\025INSTANT_RUN_TRANSFORM\020\005\022!\n\035INS" +
      "TANT_RUN_VERIFER_TRANSFORM\020\006\022\020\n\014JACK_PRE" +
      "_DEX\020\007\022\010\n\004JACK\020\010\022\031\n\021DEPRECATED_JACOCO\020\t\032" +
      "\002\010\001\022\017\n\013JAR_MERGING\020\n\022\017\n\013LIBRARY_JAR\020\013\022\"\n" +
      "\032LIBRARY_JNI_LIBS_TRANSFORM\020\014\032\002\010\001\022\"\n\036MER" +
      "GE_JAVA_RESOURCES_TRANSFORM\020\r\022\r\n\tMULTI_D" +
      "EX\020\016\022\025\n\021BUILT_IN_SHRINKER\020\017\022!\n\035NO_CHANGE" +
      "S_VERIFIER_TRANSFORM\020\020\022\027\n\023PRO_GUARD_TRAN" +
      "SFORM\020\021\022\036\n\032SHRINK_RESOURCES_TRANSFORM\020\022\022" +
      "$\n\034DATA_BINDING_MERGE_ARTIFACTS\020\023\032\002\010\001\022\"\n" +
      "\036INSTANT_RUN_VERIFIER_TRANSFORM\020\024\022$\n\034STR" +
      "IP_DEBUG_SYMBOL_TRANSFORM\020\025\032\002\010\001\022\017\n\013LIBRA" +
      "RY_API\020\026\022(\n$INSTANT_RUN_DEPENDENCIES_APK" +
      "_BUILDER\020\027\022\'\n#INSTANT_RUN_SLICE_SPLIT_AP" +
      "K_BUILDER\020\030\022\013\n\007PRE_DEX\020\031\022\020\n\014JACK_COMPILE" +
      "\020\032\022\025\n\021JACK_GENERATE_DEX\020\033\022\032\n\026CUSTOM_CLAS" +
      "S_TRANSFORM\020\034\022!\n\035DEX_ARCHIVE_BUILDER_TRA" +
      "NSFORM\020\035\022\030\n\024DEX_MERGER_TRANSFORM\020\036\022\021\n\rMA" +
      "IN_DEX_LIST\020\037\022\031\n\021DESUGAR_TRANSFORM\020 \032\002\010\001" +
      "\022\030\n\020FIX_STACK_FRAMES\020!\032\002\010\001\022\"\n\036EXTERNAL_L" +
      "IBS_MERGER_TRANSFORM\020\"\022\"\n\032D8_MAIN_DEX_LI" +
      "ST_TRANSFORM\020#\032\002\010\001\022(\n DATA_BINDING_MERGE" +
      "_GEN_CLASS_LOG\020$\032\002\010\001\022\024\n\014R8_TRANSFORM\020%\032\002" +
      "\010\001\022\032\n\026DEX_SPLITTER_TRANSFORM\020&\022\037\n\027MERGE_" +
      "CLASSES_TRANSFORM\020\'\032\002\010\001\022\036\n\032LIBRARY_AAR_J" +
      "ARS_TRANSFORM\020(\022!\n\031LIBRARY_INTERMEDIATE_" +
      "JARS\020)\032\002\010\001\022\026\n\016TEST_TRANSFORM\020*\032\002\010\001\022\026\n\022FI" +
      "REBASE_TRANSFORM\020+\022\033\n\026DEX_ARTIFACT_TRANS" +
      "FORM\020\350\007\022#\n\036EXTRACT_AAR_ARTIFACT_TRANSFOR" +
      "M\020\351\007\022%\n PLATFORM_ATTR_ARTIFACT_TRANSFORM" +
      "\020\352\007\022-\n(FILTER_SHRINKER_RULES_ARTIFACT_TR" +
      "ANSFORM\020\353\007\022+\n&DEXING_OUTPUT_SPLIT_ARTIFA" +
      "CT_TRANSFORM\020\354\007\022#\n\036ASM_CLASSES_ARTIFACT_" +
      "TRANSFORM\020\355\007\022#\n\036EXTRACT_JNI_ARTIFACT_TRA" +
      "NSFORM\020\356\007*\343=\n\027GradleTaskExecutionType\022\025\n" +
      "\021UNKNOWN_TASK_TYPE\020\000\022\020\n\014AIDL_COMPILE\020\001\022\017" +
      "\n\013ANDROID_JAR\020\002\022\030\n\024ANDROID_JAVA_COMPILE\020" +
      "\003\022\022\n\016ANDROID_REPORT\020\004\022\025\n\021ANDROID_UNIT_TE" +
      "ST\020\005\022\022\n\016BUILD_EMULATOR\020\006\022\025\n\021BUILD_INFO_L" +
      "OADER\020\007\022\022\n\016CHECK_MANIFEST\020\010\022\037\n\033COMPATIBL" +
      "E_SCREENS_MANIFEST\020\t\022\035\n\031CREATE_MANIFEST_" +
      "KEEP_LIST\020\n\022\030\n\024DATA_BINDING_TRIGGER\020\013\022 \n" +
      "\034DATA_BINDING_PROCESS_LAYOUTS\020\014\022\025\n\021DEPEN" +
      "DENCY_REPORT\020\r\022#\n\037DEVICE_PROVIDER_INSTRU" +
      "MENT_TEST\020\016\022\031\n\025EXTERNAL_BUILD_ANCHOR\020\017\022\036" +
      "\n\032EXTERNAL_NATIVE_BUILD_JSON\020\020\022\031\n\025EXTERN" +
      "AL_NATIVE_BUILD\020\021\022\027\n\023EXTRACT_ANNOTATIONS" +
      "\020\022\022\032\n\026EXTRACT_JAVA_RESOURCES\020\023\022\032\n\026EXTRAC" +
      "T_PROGUARD_FILES\020\024\022!\n\035FAST_DEPLOY_RUNTIM" +
      "E_EXTRACTOR\020\025\022\025\n\021FILTERED_JAR_COPY\020\026\022\025\n\021" +
      "GENERATE_APK_DATA\020\027\022\031\n\025GENERATE_BUILD_CO" +
      "NFIG\020\030\022!\n\035GENERATE_INSTANT_RUN_APP_INFO\020" +
      "\031\022\027\n\023GENERATE_RES_VALUES\020\032\022\032\n\026GENERATE_S" +
      "PLIT_ABI_RES\020\033\022\023\n\017GOOGLE_SERVICES\020\034\022\031\n\025I" +
      "NCREMENTAL_SAFEGUARD\020\035\022\023\n\017INSTALL_VARIAN" +
      "T\020\036\022!\n\035INSTANT_RUN_SPLIT_APK_BUILDER\020\037\022\027" +
      "\n\023INSTANT_RUN_WRAPPER\020 \022\032\n\026INVOKE_MANIFE" +
      "ST_MERGER\020!\022\026\n\022JACK_JACOCO_REPORT\020\"\022\021\n\rJ" +
      "ACOCO_REPORT\020#\022\010\n\004LINT\020$\022\020\n\014LINT_COMPILE" +
      "\020%\022\016\n\nMERGE_FILE\020&\022 \n\034PROCESS_APPLICATIO" +
      "N_MANIFEST\020\'\022\023\n\017MERGE_RESOURCES\020(\022\034\n\030MER" +
      "GE_SOURCE_SET_FOLDERS\020)\022\030\n\024MOCKABLE_ANDR" +
      "OID_JAR\020*\022\017\n\013NDK_COMPILE\020+\022\007\n\003NDK\020,\022\027\n\023P" +
      "ACKAGE_APPLICATION\020-\022\025\n\021PACKAGE_SPLIT_AB" +
      "I\020.\022\025\n\021PACKAGE_SPLIT_RES\020/\022\021\n\rPRE_COLD_S" +
      "WAP\0200\022\030\n\024PREPARE_DEPENDENCIES\0201\022\023\n\017PREPA" +
      "RE_LIBRARY\0202\022!\n\031PROCESS_ANDROID_RESOURCE" +
      "S\0203\032\002\010\001\022\034\n\030PROCESS_LIBRARY_MANIFEST\0204\022\031\n" +
      "\025PROCESS_TEST_MANIFEST\0205\022\030\n\024RENDERSCRIPT" +
      "_COMPILE\0206\022\022\n\016SHADER_COMPILE\0207\022\022\n\016SIGNIN" +
      "G_REPORT\0208\022\024\n\020SINGLE_FILE_COPY\0209\022\017\n\013SOUR" +
      "CE_SETS\020:\022\023\n\017SPLIT_ZIP_ALIGN\020;\022\020\n\014STREAM" +
      "_BASED\020<\022\"\n\036STRIP_DEBUG_SYMBOL__DEPRECAT" +
      "ED\020=\022\026\n\022STRIP_DEPENDENCIES\020>\022\031\n\025TEST_MOD" +
      "ULE_PRO_GUARD\020?\022\017\n\013TEST_SERVER\020@\022\r\n\tTRAN" +
      "SFORM\020A\022\r\n\tUNINSTALL\020B\022\024\n\020VALIDATE_SIGNI" +
      "NG\020C\022\r\n\tZIP_ALIGN\020D\022\020\n\014JAVA_COMPILE\020E\022\025\n" +
      "\021BUILD_INFO_WRITER\020F\022\017\n\013BUNDLE_ATOM\020G\022&\n" +
      "\"CHECK_MANIFEST_IN_INSTANT_RUN_MODE\020H\022\031\n" +
      "\025EXTERNAL_NATIVE_CLEAN\020I\022\032\n\026GENERATE_ATO" +
      "M_METADATA\020J\022!\n\035GENERATE_INSTANT_APP_MET" +
      "ADATA\020K\022\024\n\020JAVA_PRE_COMPILE\020L\022\034\n\030MERGE_D" +
      "EX_ATOM_RES_CLASS\020M\022\020\n\014PACKAGE_ATOM\020N\022\027\n" +
      "\023PACKAGE_INSTANT_APP\020O\022\020\n\014PREPARE_ATOM\020P" +
      "\022!\n\035PROCESS_INSTANT_APP_RESOURCES\020Q\022\031\n\021C" +
      "LEAN_BUILD_CACHE\020R\032\002\010\001\022\030\n\024RESOLVE_DEPEND" +
      "ENCIES\020S\022\037\n\033JAVA_COMPILE_ATOM_RES_CLASS\020" +
      "T\022\033\n\027PROCESS_ATOMS_RESOURCES\020U\022\033\n\027EXTERN" +
      "AL_NATIVE_PREPARE\020V\022\024\n\020SPLITS_DISCOVERY\020" +
      "W\022\017\n\013ATOM_CONFIG\020X\022\026\n\022BUNDLE_INSTANT_APP" +
      "\020Y\022\030\n\024GENERATE_TEST_CONFIG\020Z\022\020\n\014COPY_OUT" +
      "PUTS\020[\022\021\n\rAPP_PRE_BUILD\020\\\022\022\n\016TEST_PRE_BU" +
      "ILD\020]\022\035\n\031COMPILE_ANDROID_RESOURCES\020^\022\032\n\026" +
      "LINK_ANDROID_RESOURCES\020_\022\024\n\020GENERATE_R_C" +
      "LASS\020`\022$\n FEATURE_SPLIT_DECLARATION_WRIT" +
      "ER\020a\022$\n FEATURE_SPLIT_PACKAGE_IDS_WRITER" +
      "\020b\022\"\n\036EXTRACT_JAVA8_LANG_SUPPORT_JAR\020c\022\'" +
      "\n#FEATURE_SPLIT_APPLICATION_ID_WRITER\020d\022" +
      "*\n&EXTRACT_TRY_WITH_RESOURCES_SUPPORT_JA" +
      "R\020e\022\032\n\026MODULE_METADATA_WRITER\020f\022%\n!INSTA" +
      "NT_RUN_RESOURCES_APK_BUILDER\020g\022\n\n\006DELETE" +
      "\020h\022\030\n\024CHECK_PROGUARD_FILES\020i\022\034\n\030VERIFY_L" +
      "IBRARY_RESOURCES\020j\022 \n\034CHECK_TESTED_APP_O" +
      "BFUSCATION\020k\022\031\n\025INSTANT_APP_PROVISION\020l\022" +
      "\033\n\027PLATFORM_ATTR_EXTRACTOR\020m\022\031\n\025INSTANT_" +
      "APP_SIDE_LOAD\020n\022\023\n\017COMPILE_R_CLASS\020o\022\"\n\036" +
      "LINK_LIBRARY_ANDROID_RESOURCES\020p\022!\n\035PROC" +
      "ESS_ANDROID_APP_RESOURCES\020q\022\026\n\022BUNDLE_AL" +
      "L_CLASSES\020r\022\017\n\013JAR_R_CLASS\020s\022\022\n\016KOTLIN_C" +
      "OMPILE\020t\022\017\n\013LINT_GLOBAL\020u\022\024\n\020LINT_PER_VA" +
      "RIANT\020v\022\024\n\020PREPARE_LINT_JAR\020w\022\023\n\017LINT_ST" +
      "ANDALONE\020x\022&\n\"LINK_APPLICATION_ANDROID_R" +
      "ESOURCES\020y\022\033\n\027GENERATE_LIBRARY_R_FILE\020z\022" +
      "*\n&INSTANT_RUN_MAIN_APK_RESOURCES_BUILDE" +
      "R\020{\022!\n\035DATA_BINDING_GEN_BASE_CLASSES\020|\022\'" +
      "\n#GENERATE_NAMESPACED_LIBRARY_R_FILES\020}\022" +
      " \n\034COMPILE_SOURCE_SET_RESOURCES\020~\022\035\n\031MAI" +
      "N_APK_LIST_PERSISTENCE\020\177\022\032\n\025BUILD_ARTIFA" +
      "CT_REPORT\020\200\001\022$\n\033CHECK_INSTANT_APP_LIBRAR" +
      "IES\020\201\001\032\002\010\001\022\034\n\027STATIC_LIBRARY_MANIFEST\020\202\001" +
      "\022+\n&DATA_BINDING_EXPORT_FEATURE_NAMESPAC" +
      "ES\020\203\001\022%\n DATA_BINDING_EXPORT_FEATURE_INF" +
      "O\020\204\001\022 \n\033AUTO_NAMESPACE_DEPENDENCIES\020\205\001\022\023" +
      "\n\016PACKAGE_BUNDLE\020\206\001\022\026\n\021PER_MODULE_BUNDLE" +
      "\020\207\001\022 \n\033FEATURE_SET_METADATA_WRITER\020\210\001\022\022\n" +
      "\rBUNDLE_TO_APK\020\211\001\022\021\n\014EXTRACT_APKS\020\212\001\022!\n\034" +
      "PREPARE_LINT_JAR_FOR_PUBLISH\020\213\001\022\030\n\023COMBI" +
      "NE_MODULE_INFO\020\214\001\022\037\n\032GATHER_ANDROID_MODU" +
      "LE_INFO\020\215\001\022\034\n\027GATHER_JAVA_MODULE_INFO\020\216\001" +
      "\022\r\n\010LINT_FIX\020\217\001\022\037\n\032INSTALL_VARIANT_VIA_B" +
      "UNDLE\020\220\001\022\032\n\025PACKAGE_FOR_UNIT_TEST\020\221\001\022\t\n\004" +
      "KAPT\020\222\001\022\030\n\023KAPT_GENERATE_STUBS\020\223\001\022\036\n\031CHE" +
      "CK_MULTI_APK_LIBRARIES\020\224\001\022,\n\'INSTANT_RUN" +
      "_SPLIT_APK_RESOURCES_BUILDER\020\225\001\022\020\n\013ANDRO" +
      "ID_ZIP\020\226\001\022!\n\034PACKAGED_DEPENDENCIES_WRITE" +
      "R\020\227\001\022 \n\033LINK_ANDROID_RES_FOR_BUNDLE\020\230\001\022\020" +
      "\n\013ZIP_MERGING\020\231\001\022,\n\'DATA_BINDING_MERGE_D" +
      "EPENDENCY_ARTIFACTS\020\232\001\022\017\n\nBUNDLE_AAR\020\233\001\022" +
      "\030\n\023APP_CLASSPATH_CHECK\020\234\001\022\027\n\022GATHER_MODU" +
      "LE_INFO\020\235\001\022\032\n\025APPLICATION_ID_WRITER\020\236\001\022\026" +
      "\n\021KAPT_WITH_KOTLINC\020\237\001\022\031\n\024KAPT_WITHOUT_K" +
      "OTLINC\020\240\001\022\013\n\006JACOCO\020\241\001\022\035\n\030BUNDLE_TO_STAN" +
      "DALONE_APK\020\242\001\022*\n%LEGACY_SHRINK_BUNDLE_MO" +
      "DULE_RESOURCES\020\243\001\022\020\n\013DEX_MERGING\020\244\001\022\031\n\024P" +
      "ACKAGE_RENDERSCRIPT\020\245\001\022\025\n\020PROCESS_JAVA_R" +
      "ES\020\246\001\022\"\n\035MERGE_CONSUMER_PROGUARD_FILES\020\247" +
      "\001\022\030\n\023PROCESS_ANNOTATIONS\020\250\001\022\032\n\025SIGNING_C" +
      "ONFIG_WRITER\020\251\001\022\023\n\016LIBRARY_DEXING\020\252\001\022&\n!" +
      "DATA_BINDING_MERGE_BASE_CLASS_LOG\020\253\001\022\037\n\026" +
      "BUNDLE_LIBRARY_CLASSES\020\254\001\032\002\010\001\022\034\n\027BUNDLE_" +
      "LIBRARY_JAVA_RES\020\255\001\022\035\n\030RECALCULATE_STACK" +
      "_FRAMES\020\256\001\022\024\n\017FINALIZE_BUNDLE\020\257\001\022\037\n\032BUND" +
      "LE_REPORT_DEPENDENCIES\020\260\001\022#\n\036PER_MODULE_" +
      "REPORT_DEPENDENCIES\020\261\001\022\034\n\027CHECK_DUPLICAT" +
      "E_CLASSES\020\262\001\022+\n&CREATE_NON_NAMESPACED_LI" +
      "BRARY_MANIFEST\020\263\001\022\030\n\023MERGE_JAVA_RESOURCE" +
      "\020\264\001\022\026\n\021MERGE_NATIVE_LIBS\020\265\001\022\034\n\027PARSE_LIB" +
      "RARY_RESOURCES\020\266\001\022$\n\037GENERATE_LIBRARY_PR" +
      "OGUARD_RULES\020\267\001\022\032\n\025DEX_FILE_DEPENDENCIES" +
      "\020\270\001\022\025\n\020D8_MAIN_DEX_LIST\020\271\001\022\030\n\023STRIP_DEBU" +
      "G_SYMBOLS\020\272\001\022\022\n\rMERGE_CLASSES\020\273\001\022\025\n\020LIBR" +
      "ARY_JNI_LIBS\020\274\001\022\027\n\022EXTRACT_DEEP_LINKS\020\275\001" +
      "\022\031\n\024ANALYZE_DEPENDENCIES\020\276\001\022\024\n\017ANDROID_V" +
      "ARIANT\020\277\001\022\031\n\024CLASSPATH_COMPARISON\020\300\001\022\021\n\014" +
      "DEX_SPLITTER\020\301\001\022\020\n\013INCREMENTAL\020\302\001\022\025\n\020LIB" +
      "RARY_AAR_JARS\020\303\001\022\016\n\tLINT_BASE\020\304\001\022\027\n\022MANI" +
      "FEST_PROCESSOR\020\305\001\022\024\n\017NEW_INCREMENTAL\020\306\001\022" +
      "\024\n\017NON_INCREMENTAL\020\307\001\022\035\n\030PACKAGE_ANDROID" +
      "_ARTIFACT\020\310\001\022\023\n\016RESOURCE_AWARE\020\311\001\022\"\n\035SHR" +
      "INK_RESOURCES_OLD_SHRINKER\020\312\001\022\030\n\023DEX_ARC" +
      "HIVE_BUILDER\020\313\001\022\014\n\007DESUGAR\020\314\001\022\032\n\025PROGUAR" +
      "D_CONFIGURABLE\020\315\001\022\036\n\031COMPILE_LIBRARY_RES" +
      "OURCES\020\316\001\022#\n\036EXPORT_CONSUMER_PROGUARD_FI" +
      "LES\020\317\001\022\026\n\021APK_ZIP_PACKAGING\020\320\001\022\007\n\002R8\020\321\001\022" +
      "\033\n\026PARSE_INTEGRITY_CONFIG\020\322\001\022\r\n\010PROGUARD" +
      "\020\323\001\022\030\n\023FEATURE_NAME_WRITER\020\324\001\022\027\n\022L8_DEX_" +
      "DESUGAR_LIB\020\325\001\022\033\n\026PREPARE_KOTLIN_COMPILE" +
      "\020\326\001\022#\n\036ASSET_PACK_MANIFEST_GENERATION\020\327\001" +
      "\022 \n\033PROCESS_ASSET_PACK_MANIFEST\020\330\001\022!\n\034LI" +
      "NK_MANIFEST_FOR_ASSET_PACK\020\331\001\022\032\n\025ASSET_P" +
      "ACK_PRE_BUNDLE\020\332\001\022\"\n\035SDK_DEPENDENCY_DATA" +
      "_GENERATOR\020\333\001\022\"\n\035GENERATE_EMPTY_RESOURCE" +
      "_FILES\020\334\001\022\037\n\032BUNDLE_LIBRARY_CLASSES_DIR\020" +
      "\335\001\022\037\n\032BUNDLE_LIBRARY_CLASSES_JAR\020\336\001\022\034\n\027G" +
      "ENERATE_ML_MODEL_CLASS\020\337\001\0222\n-GENERATE_NA" +
      "MESPACED_LIBRARY_SYMBOL_LIST_FILES\020\340\001\022\027\n" +
      "\022OPTIMIZE_RESOURCES\020\341\001\022\"\n\035EXTRACT_NATIVE" +
      "_DEBUG_METADATA\020\342\001\022 \n\033MERGE_NATIVE_DEBUG" +
      "_METADATA\020\343\001\022 \n\033PROCESS_MANIFEST_FOR_BUN" +
      "DLE\020\344\001\022*\n%PROCESS_MANIFEST_FOR_METADATA_" +
      "FEATURE\020\345\001\022%\n PROCESS_MANIFEST_FOR_INSTA" +
      "NT_APP\020\346\001\022\023\n\016UNSAFE_OUTPUTS\020\347\001\022\036\n\031PROCES" +
      "S_PACKAGED_MANIFEST\020\350\001\022+\n&PROCESS_MULTI_" +
      "APK_APPLICATION_MANIFEST\020\351\001\022\032\n\021ENUMERATE" +
      "_CLASSES\020\352\001\032\002\010\001\022\024\n\017COMPRESS_ASSETS\020\353\001\022\021\n" +
      "\014AAR_METADATA\020\354\001\022\023\n\016PREFAB_PACKAGE\020\355\001\022\027\n" +
      "\022CHECK_AAR_METADATA\020\356\001\022\032\n\025GENERATE_MANIF" +
      "EST_JAR\020\357\001\022 \n\033SHRINK_APP_BUNDLE_RESOURCE" +
      "S\020\360\001\022\t\n\004BASE\020\361\001\022\033\n\026NON_INCREMENTAL_GLOBA" +
      "L\020\362\001\022\'\n\036LINT_MODEL_DEPENDENCIES_WRITER\020\363" +
      "\001\032\002\010\001\022\026\n\021LINT_MODEL_WRITER\020\364\001\022\034\n\027GENERAT" +
      "E_API_PUBLIC_TXT\020\365\001\022\"\n\035SHRINK_RESOURCES_" +
      "NEW_SHRINKER\020\366\001\022)\n$EXTRACT_PROFILER_NATI" +
      "VE_DEPENDENCIES\020\367\001\022\037\n\032TRANSFORM_CLASSES_" +
      "WITH_ASM\020\370\001\022\031\n\024MANAGED_DEVICE_SETUP\020\371\001\022\030" +
      "\n\023ANALYTICS_RECORDING\020\372\001\022\021\n\014APP_METADATA" +
      "\020\373\001\022\031\n\024MANAGED_DEVICE_CLEAN\020\374\001\022#\n\036SIGNIN" +
      "G_CONFIG_VERSIONS_WRITER\020\375\001\022\021\n\014ANDROID_L" +
      "INT\020\376\001\022\030\n\023ANDROID_LINT_GLOBAL\020\377\001\022\036\n\031BUND" +
      "LE_IDE_MODEL_PRODUCER\020\200\002\022\031\n\024MAP_SOURCE_S" +
      "ET_PATHS\020\201\002\022(\n#MANAGED_DEVICE_INSTRUMENT" +
      "ATION_TEST\020\202\002\022\026\n\021JACOCO_PROPERTIES\020\203\002\022\035\n" +
      "\030ANDROID_LINT_COPY_REPORT\020\204\002\022!\n\034DESUGAR_" +
      "LIB_KEEP_RULES_MERGE\020\205\002\022\034\n\027D8_BUNDLE_MAI" +
      "N_DEX_LIST\020\206\002\022\026\n\021FEATURE_DEX_MERGE\020\207\002\022\032\n" +
      "\025ANDROID_LINT_ANALYSIS\020\210\002\022#\n\036MERGE_R_FIL" +
      "ES_FOR_DATA_BINDING\020\211\002\022\027\n\022DEVICE_SERIAL_" +
      "TEST\020\212\002\022\030\n\023LINT_MODEL_METADATA\020\213\002\022\026\n\021MER" +
      "GE_ART_PROFILE\020\214\002\022 \n\033PROCESS_LIBRARY_ART" +
      "_PROFILE\020\215\002\022\030\n\023COMPILE_ART_PROFILE\020\216\002\022\035\n" +
      "\030ANDROID_LINT_TEXT_OUTPUT\020\217\002\022\017\n\nSOURCE_J" +
      "AR\020\220\002\022\037\n\032MERGE_ASSETS_FOR_UNIT_TEST\020\221\002\022\023" +
      "\n\016CHECK_JETIFIER\020\222\002\022\030\n\023JAVA_DOC_GENERATI" +
      "ON\020\223\002\022\021\n\014JAVA_DOC_JAR\020\224\002\022\032\n\025LISTING_FILE" +
      "_REDIRECT\020\225\002\022!\n\034PREFAB_PACKAGE_CONFIGURA" +
      "TION\020\226\002\022\036\n\031APPLICATION_VARIANT_MODEL\020\227\002\022" +
      "\033\n\026ABSTRACT_VARIANT_MODEL\020\230\002\022\032\n\025LIBRARY_" +
      "VARIANT_MODEL\020\231\002\022\"\n\035DYNAMIC_FEATURE_VARI" +
      "ANT_MODEL\020\232\002\022\037\n\032ANDROID_TEST_VARIANT_MOD" +
      "EL\020\233\002\022\027\n\022TEST_VARIANT_MODEL\020\234\002\022\034\n\027UNIT_T" +
      "EST_VARIANT_MODEL\020\235\002\022\031\n\024MODULE_VARIANT_M" +
      "ODEL\020\236\002\022\036\n\031TEST_MODULE_VARIANT_MODEL\020\237\002*" +
      "\370&\n\rBooleanOption\022\032\n\026UNKNOWN_BOOLEAN_OPT" +
      "ION\020\000\022\020\n\014ENABLE_AAPT2\020\001\022\033\n\027ENABLE_IN_PRO" +
      "CESS_AAPT2\020\002\022\034\n\030ENABLE_DAEMON_MODE_AAPT2" +
      "\020\003\022\032\n\022ENABLE_BUILD_CACHE\020\004\032\002\010\001\022\027\n\023ENABLE" +
      "_PROFILE_JSON\020\005\022\027\n\023ENABLE_SDK_DOWNLOAD\020\006" +
      "\022\030\n\024ENABLE_TEST_SHARDING\020\007\022\026\n\022ENABLE_DEX" +
      "_ARCHIVE\020\010\022\"\n\036ENABLE_NEW_RESOURCE_PROCES" +
      "SING\020\t\022)\n%ENABLE_IMPROVED_DEPENDENCY_RES" +
      "OLUTION\020\n\022\'\n#ENABLE_INTERMEDIATE_ARTIFAC" +
      "TS_CACHE\020\013\022\036\n\032ENABLE_EXTRACT_ANNOTATIONS" +
      "\020\014\022#\n\037VERSION_CHECK_OVERRIDE_PROPERTY\020\r\022" +
      "\'\n#VERSION_CHECK_OVERRIDE_PROPERTY_OLD\020\016" +
      "\022 \n\034OVERRIDE_PATH_CHECK_PROPERTY\020\017\022$\n OV" +
      "ERRIDE_PATH_CHECK_PROPERTY_OLD\020\020\022\022\n\016ENAB" +
      "LE_DESUGAR\020\021\022\031\n\025ENABLE_GRADLE_WORKERS\020\022\022" +
      " \n\034DISABLE_RES_MERGE_IN_LIBRARY\020\023\022\r\n\tENA" +
      "BLE_D8\020\024\022\031\n\025ENABLE_DEPRECATED_NDK\020\025\022\037\n\033D" +
      "ISABLE_RESOURCE_VALIDATION\020\026\022\031\n\025BUILD_ON" +
      "LY_TARGET_ABI\020\027\022\032\n\026KEEP_TIMESTAMPS_IN_AP" +
      "K\020\030\022\030\n\024IDE_INVOKED_FROM_IDE\020\031\022\030\n\024IDE_BUI" +
      "LD_MODEL_ONLY\020\032\022!\n\035IDE_BUILD_MODEL_ONLY_" +
      "ADVANCED\020\033\022-\n)IDE_BUILD_MODEL_FEATURE_FU" +
      "LL_DEPENDENCIES\020\034\022%\n!IDE_REFRESH_EXTERNA" +
      "L_NATIVE_MODEL\020\035\022\035\n\031IDE_GENERATE_SOURCES" +
      "_ONLY\020\036\022!\n\035ENABLE_SEPARATE_APK_RESOURCES" +
      "\020\037\022&\n\"ENABLE_BUILDSCRIPT_CLASSPATH_CHECK" +
      "\020 \022+\n\'ENABLE_EXPERIMENTAL_FEATURE_DATABI" +
      "NDING\020!\022,\n(CONSUME_DEPENDENCIES_AS_SHARE" +
      "D_LIBRARIES\020\"\022\032\n\026ENABLE_NEW_DSL_AND_API\020" +
      "#\022\030\n\024ENABLE_D8_DESUGARING\020$\022!\n\035ENABLE_IN" +
      "CREMENTAL_DESUGARING\020%\022\'\n#ENABLE_SEPARAT" +
      "E_R_CLASS_COMPILATION\020&\022\033\n\027ENABLE_D8_MAI" +
      "N_DEX_LIST\020\'\022\032\n\026ENABLE_DATA_BINDING_V2\020(" +
      "\022\037\n\033ENABLE_AAPT2_WORKER_ACTIONS\020)\022\034\n\030ENA" +
      "BLE_CORE_LAMBDA_STUBS\020*\022\'\n#CONVERT_NON_N" +
      "AMESPACED_DEPENDENCIES\020+\022\030\n\024USE_AAPT2_FR" +
      "OM_MAVEN\020,\022\034\n\024ENABLE_R8_DEPRECATED\020-\032\002\010\001" +
      "\022\030\n\024ENABLE_R8_DESUGARING\020.\022\027\n\023ENABLE_DYN" +
      "AMIC_APPS\020/\022\023\n\017ENABLE_JETIFIER\0200\022\021\n\rUSE_" +
      "ANDROID_X\0201\022%\n!ENABLE_UNIT_TEST_BINARY_R" +
      "ESOURCES\0202\022\"\n\036DISABLE_EARLY_MANIFEST_PAR" +
      "SING\0203\022#\n\037ENABLE_PARALLEL_NATIVE_JSON_GE" +
      "N\0204\022\035\n\031ENABLE_SIDE_BY_SIDE_CMAKE\0205\022:\n6EX" +
      "CLUDE_R_AND_MANIFEST_DOT_JAVA_FROM_GENER" +
      "ATED_SOURCES\0206\0225\n1WARN_ABOUT_DEPENDENCY_" +
      "RESOLUTION_AT_CONFIGURATION\0207\0223\n/DISALLO" +
      "W_DEPENDENCY_RESOLUTION_AT_CONFIGURATION" +
      "\0208\022\035\n\031DEPLOYMENT_USES_DIRECTORY\0209\022\'\n#DEP" +
      "LOYMENT_PROVIDES_LIST_OF_CHANGES\020:\022\'\n#EN" +
      "ABLE_RESOURCE_NAMESPACING_DEFAULT\020;\022$\n E" +
      "NABLE_PROGUARD_RULES_EXTRACTION\020<\022\032\n\026INJ" +
      "ECT_SDK_MAVEN_REPOS\020=\022\032\n\022NAMESPACED_R_CL" +
      "ASS\020>\032\002\010\001\022$\n ENABLE_DEXING_ARTIFACT_TRAN" +
      "SFORM\020?\022\035\n\031IDE_DEPLOY_AS_INSTANT_APP\020@\022\027" +
      "\n\023IDE_EXTRACT_INSTANT\020A\022-\n)ENABLE_UNCOMP" +
      "RESSED_NATIVE_LIBS_IN_BUNDLE\020B\022\036\n\032USE_DE" +
      "PENDENCY_CONSTRAINTS\020C\022)\n%ENABLE_SEPARAT" +
      "E_ANNOTATION_PROCESSING\020D\022\026\n\022DEBUG_OBSOL" +
      "ETE_API\020E\022\013\n\007FULL_R8\020F\022)\n%ENABLE_NATIVE_" +
      "COMPILER_SETTINGS_CACHE\020G\022\032\n\026CONDITIONAL" +
      "_KEEP_RULES\020H\022\027\n\023ENABLE_R8_LIBRARIES\020I\022\"" +
      "\n\036ENABLE_DUPLICATE_CLASSES_CHECK\020J\022 \n\034EN" +
      "FORCE_UNIQUE_PACKAGE_NAMES\020K\022$\n USE_RELA" +
      "TIVE_PATH_IN_TEST_CONFIG\020L\022#\n\037ENABLE_INC" +
      "REMENTAL_DATA_BINDING\020M\022\037\n\033ENABLE_STUDIO" +
      "_VERSION_CHECK\020N\022 \n\034KEEP_SERVICES_BETWEE" +
      "N_BUILDS\020O\022\031\n\025USE_NON_FINAL_RES_IDS\020P\022\033\n" +
      "\027ENABLE_SIDE_BY_SIDE_NDK\020Q\022/\n+ENABLE_DEX" +
      "ING_DESUGARING_ARTIFACT_TRANSFORM\020R\022#\n\033P" +
      "RECOMPILE_REMOTE_RESOURCES\020S\032\002\010\001\022\033\n\023ENAB" +
      "LE_VIEW_BINDING\020T\032\002\010\001\022\027\n\017GENERATE_R_JAVA" +
      "\020U\032\002\010\001\022#\n\037ENABLE_CMAKE_BUILD_COHABITATIO" +
      "N\020V\022\037\n\033FORCE_JACOCO_OUT_OF_PROCESS\020W\022\027\n\023" +
      "USE_NEW_JAR_CREATOR\020X\022\027\n\023USE_NEW_APK_CRE" +
      "ATOR\020Y\022\'\n#COMPILE_CLASSPATH_LIBRARY_R_CL" +
      "ASSES\020Z\022\"\n\032PRECOMPILE_LOCAL_RESOURCES\020[\032" +
      "\002\010\001\022)\n%ENABLE_ADDITIONAL_ANDROID_TEST_OU" +
      "TPUT\020\\\022#\n\037ENABLE_APP_COMPILE_TIME_R_CLAS" +
      "S\020]\022\026\n\022MINIMAL_KEEP_RULES\020^\022%\n!PRECOMPIL" +
      "E_DEPENDENCIES_RESOURCES\020_\022+\n\'EXCLUDE_RE" +
      "S_SOURCES_FOR_RELEASE_BUNDLES\020`\022\027\n\023USE_S" +
      "AFE_PROPERTIES\020a\022\035\n\031BUILD_FEATURE_BUILDC" +
      "ONFIG\020b\022\035\n\031BUILD_FEATURE_DATABINDING\020c\022\035" +
      "\n\031BUILD_FEATURE_VIEWBINDING\020d\022\026\n\022BUILD_F" +
      "EATURE_AIDL\020e\022\036\n\032BUILD_FEATURE_RENDERSCR" +
      "IPT\020f\022\033\n\027BUILD_FEATURE_RESVALUES\020g\022\031\n\025BU" +
      "ILD_FEATURE_SHADERS\020h\022 \n\034ENABLE_JVM_RESO" +
      "URCE_COMPILER\020i\022#\n\037ENABLE_R_TXT_RESOURCE" +
      "_SHRINKING\020j\022\'\n#ENABLE_PARTIAL_R_INCREME" +
      "NTAL_BUILDS\020k\022\035\n\031JETIFIER_SKIP_IF_POSSIB" +
      "LE\020l\022%\n!ENABLE_INCREMENTAL_DEXING_TASK_V" +
      "2\020m\022\021\n\rENABLE_PREFAB\020n\022#\n\037INCLUDE_DEPEND" +
      "ENCY_INFO_IN_APKS\020o\022#\n\037BUILD_FEATURE_AND" +
      "ROID_RESOURCES\020p\0226\n2ENABLE_DEXING_ARTIFA" +
      "CT_TRANSFORM_FOR_EXTERNAL_LIBS\020q\022\024\n\014ENAB" +
      "LE_MLKIT\020r\032\002\010\001\022\027\n\023DISABLE_MEMOIZATION\020s\022" +
      "!\n\035ENABLE_RESOURCE_OPTIMIZATIONS\020t\022 \n\034BU" +
      "ILD_FEATURE_MLMODELBINDING\020u\022\032\n\026NON_TRAN" +
      "SITIVE_R_CLASS\020v\022\025\n\021ENABLE_LEGACY_API\020w\022" +
      "+\n\'ANDROID_TEST_USES_UNIFIED_TEST_PLATFO" +
      "RM\020x\022\025\n\021ENABLE_STABLE_IDS\020y\022#\n\037ENABLE_BU" +
      "ILD_CONFIG_AS_BYTECODE\020z\022#\n\033ANDROID_TEST" +
      "_USES_RETENTION\020{\032\002\010\001\022\027\n\023ENABLE_AAR_META" +
      "DATA\020|\022 \n\034ENABLE_NEW_RESOURCE_SHRINKER\020}" +
      "\022\036\n\032NON_TRANSITIVE_APP_R_CLASS\020~\022\'\n#ENAB" +
      "LE_INCREMENTAL_DEXING_TRANSFORM\020\177\022\034\n\027GEN" +
      "ERATE_MANIFEST_CLASS\020\200\001\022\034\n\027IDE_BUILD_MOD" +
      "EL_ONLY_V2\020\201\001\022 \n\033ENABLE_SYMBOL_TABLE_CAC" +
      "HING\020\202\001\022)\n$ENABLE_NEW_RESOURCE_SHRINKER_" +
      "PRECISE\020\203\001\022\033\n\026USE_NEW_DSL_INTERFACES\020\204\001\022" +
      "\033\n\026ENABLE_V2_NATIVE_MODEL\020\205\001\022\032\n\025PREFER_C" +
      "MAKE_FILE_API\020\206\001\022\027\n\022USE_NEW_LINT_MODEL\020\207" +
      "\001\022(\n#ENABLE_NATIVE_CONFIGURATION_FOLDING" +
      "\020\210\001\022 \n\033ENABLE_SOURCE_SET_PATHS_MAP\020\211\001\022\031\n" +
      "\024ENABLE_LOCAL_TESTING\020\212\001\022\033\n\026ENABLE_DATAB" +
      "INDING_KTX\020\213\001\022\030\n\023RUN_LINT_IN_PROCESS\020\214\001\022" +
      "\036\n\031USE_LINT_PARTIAL_ANALYSIS\020\215\001\022#\n\036RELAT" +
      "IVE_COMPILE_LIB_RESOURCES\020\216\001\022\037\n\032R8_FAIL_" +
      "ON_MISSING_CLASSES\020\217\001\022\031\n\024ENABLE_TEST_FIX" +
      "TURES\020\220\001\022.\n)INCLUDE_REPOSITORIES_IN_DEPE" +
      "NDENCY_REPORT\020\221\001\022\030\n\023ENABLE_ART_PROFILES\020" +
      "\222\001\022,\n\'ENABLE_JACOCO_TRANSFORM_INSTRUMENT" +
      "ATION\020\223\001\022\034\n\027FORCE_DETERMINISTIC_APK\020\224\001\022 " +
      "\n\033DISABLE_MINSDKLIBRARY_CHECK\020\225\001\022 \n\033UNIN" +
      "STALL_INCOMPATIBLE_APKS\020\226\001*\302\002\n\025OptionalB" +
      "ooleanOption\022#\n\037UNKNOWN_OPTIONAL_BOOLEAN" +
      "_OPTION\020\000\022\026\n\022SIGNING_V1_ENABLED\020\001\022\026\n\022SIG" +
      "NING_V2_ENABLED\020\002\022\021\n\rIDE_TEST_ONLY\020\003\022\020\n\014" +
      "SERIAL_AAPT2\020\004\022\r\n\tENABLE_R8\020\005\022$\n FIREBAS" +
      "E_PERF_PLUGIN_ENABLE_FLAG\020\006\0223\n/ENABLE_TE" +
      "ST_FAILURE_RETENTION_COMPRESS_SNAPSHOT\020\007" +
      "\022\033\n\027INTERNAL_ONLY_ENABLE_R8\020\010\022(\n$DISABLE" +
      "_AUTOMATIC_COMPONENT_CREATION\020\t*\253\003\n\rInte" +
      "gerOption\022\032\n\026UNKNOWN_INTEGER_OPTION\020\000\022\034\n" +
      "\030ANDROID_TEST_SHARD_COUNT\020\001\022\027\n\023ANDROID_S" +
      "DK_CHANNEL\020\002\022\024\n\020THREAD_POOL_SIZE\020\003\022 \n\034ID" +
      "E_BUILD_MODEL_ONLY_VERSION\020\004\022\031\n\025IDE_TARG" +
      "ET_DEVICE_API\020\005\022\035\n\031IDE_VERSION_CODE_OVER" +
      "RIDE\020\006\022\033\n\027DEXING_READ_BUFFER_SIZE\020\007\022\034\n\030D" +
      "EXING_WRITE_BUFFER_SIZE\020\010\022\034\n\030DEXING_NUMB" +
      "ER_OF_BUCKETS\020\t\022 \n\034PRE_O_MAX_NUMBER_OF_F" +
      "EATURES\020\n\022\032\n\026AAPT2_THREAD_POOL_SIZE\020\013\022\032\n" +
      "\026TEST_FAILURE_RETENTION\020\014\022\"\n\036MANAGED_DEV" +
      "ICE_SHARD_POOL_SIZE\020\r*G\n\nLongOption\022\027\n\023U" +
      "NKNOWN_LONG_OPTION\020\000\022 \n\034DEPRECATED_NDK_C" +
      "OMPILE_LEASE\020\001*\374\010\n\014StringOption\022\031\n\025UNKNO" +
      "WN_STRING_OPTION\020\000\022\027\n\017BUILD_CACHE_DIR\020\001\032" +
      "\002\010\001\022\034\n\030IDE_BUILD_TARGET_DENSITY\020\002\022\030\n\024IDE" +
      "_BUILD_TARGET_ABI\020\003\022 \n\034IDE_RESTRICT_VARI" +
      "ANT_PROJECT\020\004\022\035\n\031IDE_RESTRICT_VARIANT_NA" +
      "ME\020\005\022\032\n\026IDE_SIGNING_STORE_TYPE\020\006\022\032\n\026IDE_" +
      "SIGNING_STORE_FILE\020\007\022\036\n\032IDE_SIGNING_STOR" +
      "E_PASSWORD\020\010\022\031\n\025IDE_SIGNING_KEY_ALIAS\020\t\022" +
      "\034\n\030IDE_SIGNING_KEY_PASSWORD\020\n\022\024\n\020IDE_APK" +
      "_LOCATION\020\013\022\"\n\036IDE_OPTIONAL_COMPILATION_" +
      "STEPS\020\014\022\026\n\022IDE_COLD_SWAP_MODE\020\r\022\035\n\031IDE_V" +
      "ERSION_NAME_OVERRIDE\020\016\022\036\n\032IDE_TARGET_DEV" +
      "ICE_CODENAME\020\017\022\'\n#IDE_ANDROID_CUSTOM_CLA" +
      "SS_TRANSFORMS\020\020\022\026\n\022DEVICE_POOL_SERIAL\020\021\022" +
      "\026\n\022PROFILE_OUTPUT_DIR\020\022\022\036\n\032BUILD_ARTIFAC" +
      "T_REPORT_FILE\020\023\022\035\n\031AAPT2_FROM_MAVEN_OVER" +
      "RIDE\020\024\022\031\n\025IDE_APK_SELECT_CONFIG\020\025\022(\n$SUP" +
      "PRESS_UNSUPPORTED_OPTION_WARNINGS\020\026\022\036\n\032I" +
      "DE_ANDROID_STUDIO_VERSION\020\027\022\026\n\022JETIFIER_",
      "BLACKLIST\020\030\022!\n\035IDE_ATTRIBUTION_FILE_LOCA" +
      "TION\020\031\022\024\n\020PREFAB_CLASSPATH\020\032\022\022\n\016PREFAB_V" +
      "ERSION\020\033\022$\n IDE_INSTALL_DYNAMIC_MODULES_" +
      "LIST\020\034\022\030\n\024JETIFIER_IGNORE_LIST\020\035\022\035\n\031NATI" +
      "VE_BUILD_OUTPUT_LEVEL\020\036\022%\n!AAPT2_FROM_MA" +
      "VEN_VERSION_OVERRIDE\020\037\022\022\n\016LINT_HEAP_SIZE" +
      "\020 \022$\n SUPPRESS_UNSUPPORTED_COMPILE_SDK\020!" +
      "\022\031\n\025LINT_VERSION_OVERRIDE\020\"\022\"\n\036IDE_CHECK" +
      "_JETIFIER_RESULT_FILE\020#\022&\n\"AAPT2_FROM_MA" +
      "VEN_PLATFORM_OVERRIDE\020$\022\024\n\020IDE_AGDE_VERS" +
      "ION\020%*\310\001\n\026VariantApiArtifactType\022\030\n\024CUST" +
      "OM_ARTIFACT_TYPE\020\000\022\007\n\003AAR\020\001\022\007\n\003APK\020\002\022\n\n\006" +
      "BUNDLE\020\003\022\024\n\020LIBRARY_MANIFEST\020\004\022\023\n\017MERGED" +
      "_MANIFEST\020\005\022\034\n\030OBFUSCATION_MAPPING_FILE\020" +
      "\006\022!\n\035PUBLIC_ANDROID_RESOURCES_LIST\020\007\022\n\n\006" +
      "ASSETS\020\010*\373\002\n\021VariantMethodType\022\027\n\023UNKNOW" +
      "N_METHOD_TYPE\020\000\022\013\n\007ENABLED\020\001\022\031\n\025MIN_SDK_" +
      "VERSION_VALUE\020\002\022\033\n\027RENDERSCRIPT_TARGET_A" +
      "PI\020\003\022\031\n\025MAX_SDK_VERSION_VALUE\020\004\022\034\n\030TARGE" +
      "T_SDK_VERSION_VALUE\020\005\022\027\n\023DEPENDENCIES_AC" +
      "TION\020\006\022\026\n\022REGISTER_EXTENSION\020\007\022\025\n\021UNIT_T" +
      "EST_ENABLED\020\010\022\030\n\024ANDROID_TEST_ENABLED\020\t\022" +
      "\023\n\017MIN_SDK_PREVIEW\020\n\022\026\n\022TARGET_SDK_PREVI" +
      "EW\020\013\022%\n!VARIANT_BUILDER_DEPENDENCIES_INF" +
      "O\020\014\022\031\n\025TEST_FIXTURES_ENABLED\020\r*\221\024\n\033Varia" +
      "ntPropertiesMethodType\022\"\n\036UNKNOWN_PROPER" +
      "TIES_METHOD_TYPE\020\000\022\r\n\tARTIFACTS\020\001\022\031\n\025ASM" +
      "_TRANSFORM_CLASSES\020\002\022\037\n\033ASM_FRAMES_COMPU" +
      "TATION_NODE\020\003\022\016\n\nBUILD_TYPE\020\004\022\023\n\017PRODUCT" +
      "_FLAVORS\020\005\022\017\n\013FLAVOR_NAME\020\006\022\034\n\030READ_ONLY" +
      "_APPLICATION_ID\020\007\022\024\n\014PACKAGE_NAME\020\010\032\002\010\001\022" +
      "\027\n\023BUILD_CONFIG_FIELDS\020\t\022\032\n\026ADD_BUILD_CO" +
      "NFIG_FIELD\020\n\022\r\n\tRES_VALUE\020\013\022\021\n\rADD_RES_V" +
      "ALUE\020\014\022\031\n\025MANIFEST_PLACEHOLDERS\020\r\022\022\n\016APP" +
      "LICATION_ID\020\016\022\020\n\014AAPT_OPTIONS\020\017\022\027\n\023AAPT_" +
      "OPTIONS_ACTION\020\020\022\031\n\025TESTED_APPLICATION_I" +
      "D\020\021\022\032\n\026INSTRUMENTATION_RUNNER\020\022\022\024\n\020HANDL" +
      "E_PROFILING\020\023\022\023\n\017FUNCTIONAL_TEST\020\024\022\016\n\nTE" +
      "ST_LABEL\020\025\022\017\n\013GET_OUTPUTS\020\026\022\025\n\021DEPENDENC" +
      "IES_INFO\020\027\022\022\n\016SIGNING_CONFIG\020\030\022\031\n\025SIGNIN" +
      "G_CONFIG_ACTION\020\031\022\022\n\016TESTED_VARIANT\020\032\022\025\n" +
      "\021PACKAGING_OPTIONS\020\033\022\034\n\030PACKAGING_OPTION" +
      "S_ACTION\020\034\022\036\n\032GET_BUILT_ARTIFACTS_LOADER" +
      "\020\035\022\020\n\014GET_ARTIFACT\020\036\022\025\n\021GET_ALL_ARTIFACT" +
      "S\020\037\022\014\n\010USE_TASK\020 \022\016\n\nWIRED_WITH\020!\022\024\n\020WIR" +
      "ED_WITH_FILES\020\"\022\023\n\017WIRED_WITH_LIST\020#\022\032\n\026" +
      "WIRED_WITH_DIRECTORIES\020$\022\020\n\014TO_APPEND_TO" +
      "\020%\022\r\n\tTO_CREATE\020&\022\025\n\021TO_TRANSFORM_FILE\020\'" +
      "\022\030\n\024TO_TRANSFORM_COMBINE\020(\022\032\n\026TO_TRANSFO" +
      "RM_DIRECTORY\020)\022\025\n\021TO_TRANSFORM_MANY\020*\022\025\n" +
      "\021SUBMIT_TO_WORKERS\020+\022\036\n\032JNI_LIBS_PACKAGI" +
      "NG_OPTIONS\020,\022%\n!JNI_LIBS_PACKAGING_OPTIO" +
      "NS_ACTION\020-\022\037\n\033RESOURCES_PACKAGING_OPTIO" +
      "NS\020.\022&\n\"RESOURCES_PACKAGING_OPTIONS_ACTI" +
      "ON\020/\022\031\n\025DEX_PACKAGING_OPTIONS\0200\022 \n\034DEX_P" +
      "ACKAGING_OPTIONS_ACTION\0201\022\030\n\024CMAKE_NATIV" +
      "E_OPTIONS\0202\022\035\n\031CMAKE_OPTIONS_ABI_FILTERS" +
      "\0203\022\033\n\027CMAKE_OPTIONS_ARGUMENTS\0204\022\031\n\025CMAKE" +
      "_OPTIONS_C_FLAGS\0205\022\033\n\027CMAKE_OPTIONS_CPP_" +
      "FLAGS\0206\022\031\n\025CMAKE_OPTIONS_TARGETS\0207\022\034\n\030ND" +
      "K_BUILD_NATIVE_OPTIONS\0208\022!\n\035NDK_BUILD_OP" +
      "TIONS_ABI_FILTERS\0209\022\037\n\033NDK_BUILD_OPTIONS" +
      "_ARGUMENTS\020:\022\035\n\031NDK_BUILD_OPTIONS_C_FLAG" +
      "S\020;\022\037\n\033NDK_BUILD_OPTIONS_CPP_FLAGS\020<\022\035\n\031" +
      "NDK_BUILD_OPTIONS_TARGETS\020=\022\r\n\tNAMESPACE" +
      "\020>\022\021\n\rGET_EXTENSION\020?\022\n\n\006DEXING\020@\022\021\n\rDEX" +
      "ING_ACTION\020A\022\027\n\023MULTI_DEX_KEEP_FILE\020B\022\033\n" +
      "\027MULTI_DEX_KEEP_PROGUARD\020C\022\020\n\014RENDERSCRI" +
      "PT\020D\022\035\n\031RENDERSCRIPT_SUPPORT_MODE\020E\022\"\n\036R" +
      "ENDERSCRIPT_SUPPORT_MODE_BLAS\020F\022\031\n\025RENDE" +
      "RSCRIPT_NDK_MODE\020G\022#\n\037RENDERSCRIPT_OPTIM" +
      "IZATION_LEVEL\020H\022\020\n\014ANDROID_TEST\020I\022\030\n\024VAR" +
      "IANT_AAR_METADATA\020J\022(\n$VARIANT_AAR_METAD" +
      "ATA_MIN_COMPILE_SDK\020K\022\034\n\030SIGNING_CONFIG_" +
      "ENABLE_V1\020L\022\034\n\030SIGNING_CONFIG_ENABLE_V2\020" +
      "M\022\034\n\030SIGNING_CONFIG_ENABLE_V3\020N\022\034\n\030SIGNI" +
      "NG_CONFIG_ENABLE_V4\020O\022!\n\035VARIANT_PSEUDOL" +
      "OCALES_ENABLED\020P\022\022\n\016PROGUARD_FILES\020Q\022\023\n\017" +
      "MIN_SDK_VERSION\020R\022\023\n\017MAX_SDK_VERSION\020S\022\026" +
      "\n\022TARGET_SDK_VERSION\020T\022\026\n\022MAKE_RES_VALUE" +
      "_KEY\020U\022\021\n\rTEST_FIXTURES\020V\022\026\n\022VARIANT_PRO" +
      "PERTIES\020W\022\035\n\031SIGNING_CONFIG_SET_CONFIG\020X" +
      "\022\025\n\021GET_BUNDLE_CONFIG\020Y\022\031\n\025GET_CODE_TRAN" +
      "SPARENCY\020Z\022\034\n\030JAVA_COMPILATION_OPTIONS\020[" +
      "\022\030\n\024ANNOTATION_PROCESSOR\020\\\022$\n ANNOTATION" +
      "_PROCESSOR_CLASS_NAMES\020]\022\"\n\036ANNOTATION_P" +
      "ROCESSOR_ARGUMENTS\020^\022+\n\'ANNOTATION_PROCE" +
      "SSOR_ARGUMENT_PROVIDERS\020_\022\025\n\021NESTED_COMP" +
      "ONENTS\020`\022(\n$VARIANT_AAR_METADATA_MIN_AGP" +
      "_VERSION\020aB3\n/com.android.tools.build.gr" +
      "adle.internal.profileP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}