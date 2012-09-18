package de.grammarcraft.flow.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.grammarcraft.flow.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'flow'", "'>'", "';'", "'.'", "'in'", "'out'", "'ebc'", "'='", "'method'", "'#'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalFlowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowParser.tokenNames; }
    public String getGrammarFileName() { return "../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g"; }



     	private FlowGrammarAccess grammarAccess;
     	
        public InternalFlowParser(TokenStream input, FlowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FlowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:76:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_functionUnits_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:79:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImport ) )* ( (lv_functionUnits_3_0= ruleFunctionUnit ) )*
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:86:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel144);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:102:4: ( (lv_imports_2_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel167);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:120:3: ( (lv_functionUnits_3_0= ruleFunctionUnit ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==19||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:121:1: (lv_functionUnits_3_0= ruleFunctionUnit )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:121:1: (lv_functionUnits_3_0= ruleFunctionUnit )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:122:3: lv_functionUnits_3_0= ruleFunctionUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionUnit_in_ruleModel189);
            	    lv_functionUnits_3_0=ruleFunctionUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionUnits",
            	              		lv_functionUnits_3_0, 
            	              		"FunctionUnit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunctionUnit"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:146:1: entryRuleFunctionUnit returns [EObject current=null] : iv_ruleFunctionUnit= ruleFunctionUnit EOF ;
    public final EObject entryRuleFunctionUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUnit = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:147:2: (iv_ruleFunctionUnit= ruleFunctionUnit EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:148:2: iv_ruleFunctionUnit= ruleFunctionUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionUnitRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit226);
            iv_ruleFunctionUnit=ruleFunctionUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUnit236); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionUnit"


    // $ANTLR start "ruleFunctionUnit"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:155:1: ruleFunctionUnit returns [EObject current=null] : (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFunctionUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Flow_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:158:28: ( (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:159:1: (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:159:1: (this_Flow_0= ruleFlow | this_Operation_1= ruleOperation )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==19||LA4_0==21) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:160:5: this_Flow_0= ruleFlow
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFlow_in_ruleFunctionUnit283);
                    this_Flow_0=ruleFlow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Flow_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:170:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFunctionUnit310);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionUnit"


    // $ANTLR start "entryRuleImport"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:186:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:187:2: (iv_ruleImport= ruleImport EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:188:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport345);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:195:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:198:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:199:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:199:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:199:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:203:1: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:204:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:204:1: (lv_importedNamespace_1_0= ruleQualifiedName )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:205:3: lv_importedNamespace_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport413);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFlow"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:229:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:230:2: (iv_ruleFlow= ruleFlow EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:231:2: iv_ruleFlow= ruleFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowRule()); 
            }
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow449);
            iv_ruleFlow=ruleFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow459); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:238:1: ruleFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_streams_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:241:28: ( (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:242:1: (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:242:1: (otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:242:3: otherlv_0= 'flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_streams_2_0= ruleStream ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFlow496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getFlowKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:246:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:247:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:247:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:248:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlow513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFlowRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:264:2: ( (lv_streams_2_0= ruleStream ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:265:1: (lv_streams_2_0= ruleStream )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:265:1: (lv_streams_2_0= ruleStream )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:266:3: lv_streams_2_0= ruleStream
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStream_in_ruleFlow539);
            	    lv_streams_2_0=ruleStream();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFlowRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"streams",
            	              		lv_streams_2_0, 
            	              		"Stream");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleStream"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:290:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:291:2: (iv_ruleStream= ruleStream EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:292:2: iv_ruleStream= ruleStream EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStreamRule()); 
            }
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream576);
            iv_ruleStream=ruleStream();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStream; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream586); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:299:1: ruleStream returns [EObject current=null] : ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleJvmTypeReference ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_leftPort_0_0 = null;

        EObject lv_message_2_0 = null;

        EObject lv_rightPort_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:302:28: ( ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleJvmTypeReference ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:303:1: ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleJvmTypeReference ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:303:1: ( ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleJvmTypeReference ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:303:2: ( (lv_leftPort_0_0= ruleLeftPort ) ) otherlv_1= '>' ( (lv_message_2_0= ruleJvmTypeReference ) ) otherlv_3= '>' ( (lv_rightPort_4_0= ruleRightPort ) ) otherlv_5= ';'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:303:2: ( (lv_leftPort_0_0= ruleLeftPort ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:304:1: (lv_leftPort_0_0= ruleLeftPort )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:304:1: (lv_leftPort_0_0= ruleLeftPort )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:305:3: lv_leftPort_0_0= ruleLeftPort
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftPort_in_ruleStream632);
            lv_leftPort_0_0=ruleLeftPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStreamRule());
              	        }
                     		set(
                     			current, 
                     			"leftPort",
                      		lv_leftPort_0_0, 
                      		"LeftPort");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStream644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:325:1: ( (lv_message_2_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:326:1: (lv_message_2_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:326:1: (lv_message_2_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:327:3: lv_message_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStreamAccess().getMessageJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleStream665);
            lv_message_2_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStreamRule());
              	        }
                     		set(
                     			current, 
                     			"message",
                      		lv_message_2_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStream677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:347:1: ( (lv_rightPort_4_0= ruleRightPort ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:348:1: (lv_rightPort_4_0= ruleRightPort )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:348:1: (lv_rightPort_4_0= ruleRightPort )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:349:3: lv_rightPort_4_0= ruleRightPort
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRightPort_in_ruleStream698);
            lv_rightPort_4_0=ruleRightPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStreamRule());
              	        }
                     		set(
                     			current, 
                     			"rightPort",
                      		lv_rightPort_4_0, 
                      		"RightPort");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStream710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleLeftPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:377:1: entryRuleLeftPort returns [EObject current=null] : iv_ruleLeftPort= ruleLeftPort EOF ;
    public final EObject entryRuleLeftPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftPort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:378:2: (iv_ruleLeftPort= ruleLeftPort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:379:2: iv_ruleLeftPort= ruleLeftPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftPortRule()); 
            }
            pushFollow(FOLLOW_ruleLeftPort_in_entryRuleLeftPort746);
            iv_ruleLeftPort=ruleLeftPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftPort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPort756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftPort"


    // $ANTLR start "ruleLeftPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:386:1: ruleLeftPort returns [EObject current=null] : (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) ;
    public final EObject ruleLeftPort() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalInputPort_0 = null;

        EObject this_UnnamedSubFlowPort_1 = null;

        EObject this_Port_2 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:389:28: ( (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:390:1: (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:390:1: (this_GlobalInputPort_0= ruleGlobalInputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==14) ) {
                    alt6=2;
                }
                else if ( (LA6_1==17) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:391:5: this_GlobalInputPort_0= ruleGlobalInputPort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalInputPort_in_ruleLeftPort803);
                    this_GlobalInputPort_0=ruleGlobalInputPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalInputPort_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:401:5: this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_ruleLeftPort830);
                    this_UnnamedSubFlowPort_1=ruleUnnamedSubFlowPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedSubFlowPort_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:411:5: this_Port_2= rulePort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePort_in_ruleLeftPort857);
                    this_Port_2=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Port_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftPort"


    // $ANTLR start "entryRuleGlobalInputPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:427:1: entryRuleGlobalInputPort returns [EObject current=null] : iv_ruleGlobalInputPort= ruleGlobalInputPort EOF ;
    public final EObject entryRuleGlobalInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalInputPort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:428:2: (iv_ruleGlobalInputPort= ruleGlobalInputPort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:429:2: iv_ruleGlobalInputPort= ruleGlobalInputPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalInputPortRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort892);
            iv_ruleGlobalInputPort=ruleGlobalInputPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalInputPort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInputPort902); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalInputPort"


    // $ANTLR start "ruleGlobalInputPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:436:1: ruleGlobalInputPort returns [EObject current=null] : (otherlv_0= '.' otherlv_1= 'in' () ) ;
    public final EObject ruleGlobalInputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:439:28: ( (otherlv_0= '.' otherlv_1= 'in' () ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:440:1: (otherlv_0= '.' otherlv_1= 'in' () )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:440:1: (otherlv_0= '.' otherlv_1= 'in' () )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:440:3: otherlv_0= '.' otherlv_1= 'in' ()
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGlobalInputPort939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGlobalInputPort951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGlobalInputPortAccess().getInKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:448:1: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:449:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalInputPort"


    // $ANTLR start "entryRuleUnnamedSubFlowPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:462:1: entryRuleUnnamedSubFlowPort returns [EObject current=null] : iv_ruleUnnamedSubFlowPort= ruleUnnamedSubFlowPort EOF ;
    public final EObject entryRuleUnnamedSubFlowPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedSubFlowPort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:463:2: (iv_ruleUnnamedSubFlowPort= ruleUnnamedSubFlowPort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:464:2: iv_ruleUnnamedSubFlowPort= ruleUnnamedSubFlowPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedSubFlowPortRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort996);
            iv_ruleUnnamedSubFlowPort=ruleUnnamedSubFlowPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedSubFlowPort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort1006); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnnamedSubFlowPort"


    // $ANTLR start "ruleUnnamedSubFlowPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:471:1: ruleUnnamedSubFlowPort returns [EObject current=null] : (otherlv_0= '.' () ) ;
    public final EObject ruleUnnamedSubFlowPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:474:28: ( (otherlv_0= '.' () ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:475:1: (otherlv_0= '.' () )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:475:1: (otherlv_0= '.' () )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:475:3: otherlv_0= '.' ()
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleUnnamedSubFlowPort1043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:479:1: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:480:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnnamedSubFlowPort"


    // $ANTLR start "entryRuleRightPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:493:1: entryRuleRightPort returns [EObject current=null] : iv_ruleRightPort= ruleRightPort EOF ;
    public final EObject entryRuleRightPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightPort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:494:2: (iv_ruleRightPort= ruleRightPort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:495:2: iv_ruleRightPort= ruleRightPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightPortRule()); 
            }
            pushFollow(FOLLOW_ruleRightPort_in_entryRuleRightPort1088);
            iv_ruleRightPort=ruleRightPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightPort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPort1098); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightPort"


    // $ANTLR start "ruleRightPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:502:1: ruleRightPort returns [EObject current=null] : (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) ;
    public final EObject ruleRightPort() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalOutputPort_0 = null;

        EObject this_UnnamedSubFlowPort_1 = null;

        EObject this_Port_2 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:505:28: ( (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:506:1: (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:506:1: (this_GlobalOutputPort_0= ruleGlobalOutputPort | this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort | this_Port_2= rulePort )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==15) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:507:5: this_GlobalOutputPort_0= ruleGlobalOutputPort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalOutputPort_in_ruleRightPort1145);
                    this_GlobalOutputPort_0=ruleGlobalOutputPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalOutputPort_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:517:5: this_UnnamedSubFlowPort_1= ruleUnnamedSubFlowPort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_ruleRightPort1172);
                    this_UnnamedSubFlowPort_1=ruleUnnamedSubFlowPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedSubFlowPort_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:527:5: this_Port_2= rulePort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePort_in_ruleRightPort1199);
                    this_Port_2=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Port_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightPort"


    // $ANTLR start "entryRuleGlobalOutputPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:543:1: entryRuleGlobalOutputPort returns [EObject current=null] : iv_ruleGlobalOutputPort= ruleGlobalOutputPort EOF ;
    public final EObject entryRuleGlobalOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalOutputPort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:544:2: (iv_ruleGlobalOutputPort= ruleGlobalOutputPort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:545:2: iv_ruleGlobalOutputPort= ruleGlobalOutputPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalOutputPortRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort1234);
            iv_ruleGlobalOutputPort=ruleGlobalOutputPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalOutputPort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalOutputPort1244); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalOutputPort"


    // $ANTLR start "ruleGlobalOutputPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:552:1: ruleGlobalOutputPort returns [EObject current=null] : (otherlv_0= '.' otherlv_1= 'out' () ) ;
    public final EObject ruleGlobalOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:555:28: ( (otherlv_0= '.' otherlv_1= 'out' () ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:556:1: (otherlv_0= '.' otherlv_1= 'out' () )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:556:1: (otherlv_0= '.' otherlv_1= 'out' () )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:556:3: otherlv_0= '.' otherlv_1= 'out' ()
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGlobalOutputPort1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGlobalOutputPort1293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:564:1: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:565:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalOutputPort"


    // $ANTLR start "entryRulePort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:578:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:579:2: (iv_rulePort= rulePort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:580:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_rulePort_in_entryRulePort1338);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:587:1: rulePort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_port_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:590:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:591:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:591:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:591:2: ( (otherlv_0= RULE_ID ) ) ( (lv_port_1_0= ruleNamedPort ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:591:2: ( (otherlv_0= RULE_ID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:592:1: (otherlv_0= RULE_ID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:592:1: (otherlv_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:593:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPortRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:604:2: ( (lv_port_1_0= ruleNamedPort ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:605:1: (lv_port_1_0= ruleNamedPort )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:605:1: (lv_port_1_0= ruleNamedPort )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:606:3: lv_port_1_0= ruleNamedPort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNamedPort_in_rulePort1414);
                    lv_port_1_0=ruleNamedPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPortRule());
                      	        }
                             		set(
                             			current, 
                             			"port",
                              		lv_port_1_0, 
                              		"NamedPort");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleNamedPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:630:1: entryRuleNamedPort returns [EObject current=null] : iv_ruleNamedPort= ruleNamedPort EOF ;
    public final EObject entryRuleNamedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedPort = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:631:2: (iv_ruleNamedPort= ruleNamedPort EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:632:2: iv_ruleNamedPort= ruleNamedPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedPortRule()); 
            }
            pushFollow(FOLLOW_ruleNamedPort_in_entryRuleNamedPort1451);
            iv_ruleNamedPort=ruleNamedPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedPort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPort1461); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedPort"


    // $ANTLR start "ruleNamedPort"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:639:1: ruleNamedPort returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNamedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:642:28: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:643:1: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:643:1: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:643:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNamedPort1498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNamedPortAccess().getFullStopKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:647:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:648:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:648:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:649:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedPort1515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNamedPortRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedPort"


    // $ANTLR start "entryRuleOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:673:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:674:2: (iv_ruleOperation= ruleOperation EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:675:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1556);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:682:1: ruleOperation returns [EObject current=null] : (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_EbcOperation_0 = null;

        EObject this_MethodOperation_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:685:28: ( (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:686:1: (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:686:1: (this_EbcOperation_0= ruleEbcOperation | this_MethodOperation_1= ruleMethodOperation )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:687:5: this_EbcOperation_0= ruleEbcOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEbcOperation_in_ruleOperation1613);
                    this_EbcOperation_0=ruleEbcOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EbcOperation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:697:5: this_MethodOperation_1= ruleMethodOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethodOperation_in_ruleOperation1640);
                    this_MethodOperation_1=ruleMethodOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MethodOperation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEbcOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:713:1: entryRuleEbcOperation returns [EObject current=null] : iv_ruleEbcOperation= ruleEbcOperation EOF ;
    public final EObject entryRuleEbcOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEbcOperation = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:714:2: (iv_ruleEbcOperation= ruleEbcOperation EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:715:2: iv_ruleEbcOperation= ruleEbcOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEbcOperationRule()); 
            }
            pushFollow(FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation1675);
            iv_ruleEbcOperation=ruleEbcOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEbcOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEbcOperation1685); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEbcOperation"


    // $ANTLR start "ruleEbcOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:722:1: ruleEbcOperation returns [EObject current=null] : (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) ) ;
    public final EObject ruleEbcOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_class_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:725:28: ( (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:726:1: (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:726:1: (otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:726:3: otherlv_0= 'ebc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEbcOperation1722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEbcOperationAccess().getEbcKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:730:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:731:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:731:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:732:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEbcOperation1739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEbcOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEbcOperation1756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:752:1: ( (lv_class_3_0= ruleNativeClass ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:753:1: (lv_class_3_0= ruleNativeClass )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:753:1: (lv_class_3_0= ruleNativeClass )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:754:3: lv_class_3_0= ruleNativeClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNativeClass_in_ruleEbcOperation1777);
            lv_class_3_0=ruleNativeClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEbcOperationRule());
              	        }
                     		set(
                     			current, 
                     			"class",
                      		lv_class_3_0, 
                      		"NativeClass");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEbcOperation"


    // $ANTLR start "entryRuleNativeClass"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:778:1: entryRuleNativeClass returns [EObject current=null] : iv_ruleNativeClass= ruleNativeClass EOF ;
    public final EObject entryRuleNativeClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeClass = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:779:2: (iv_ruleNativeClass= ruleNativeClass EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:780:2: iv_ruleNativeClass= ruleNativeClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeClassRule()); 
            }
            pushFollow(FOLLOW_ruleNativeClass_in_entryRuleNativeClass1813);
            iv_ruleNativeClass=ruleNativeClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeClass1823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNativeClass"


    // $ANTLR start "ruleNativeClass"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:787:1: ruleNativeClass returns [EObject current=null] : ( (lv_reference_0_0= ruleJvmTypeReference ) ) ;
    public final EObject ruleNativeClass() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:790:28: ( ( (lv_reference_0_0= ruleJvmTypeReference ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:791:1: ( (lv_reference_0_0= ruleJvmTypeReference ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:791:1: ( (lv_reference_0_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:792:1: (lv_reference_0_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:792:1: (lv_reference_0_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:793:3: lv_reference_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeClassAccess().getReferenceJvmTypeReferenceParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleNativeClass1868);
            lv_reference_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNativeClassRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeClass"


    // $ANTLR start "entryRuleMethodOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:817:1: entryRuleMethodOperation returns [EObject current=null] : iv_ruleMethodOperation= ruleMethodOperation EOF ;
    public final EObject entryRuleMethodOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodOperation = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:818:2: (iv_ruleMethodOperation= ruleMethodOperation EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:819:2: iv_ruleMethodOperation= ruleMethodOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1903);
            iv_ruleMethodOperation=ruleMethodOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodOperation1913); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodOperation"


    // $ANTLR start "ruleMethodOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:826:1: ruleMethodOperation returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ) ;
    public final EObject ruleMethodOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_class_3_0 = null;

        EObject lv_method_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:829:28: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:830:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:830:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:830:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_class_3_0= ruleNativeClass ) ) otherlv_4= '#' ( (lv_method_5_0= ruleNativeMethod ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleMethodOperation1950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMethodOperationAccess().getMethodKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:834:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:835:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:835:1: (lv_name_1_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:836:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodOperation1967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMethodOperation1984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:856:1: ( (lv_class_3_0= ruleNativeClass ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:857:1: (lv_class_3_0= ruleNativeClass )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:857:1: (lv_class_3_0= ruleNativeClass )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:858:3: lv_class_3_0= ruleNativeClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNativeClass_in_ruleMethodOperation2005);
            lv_class_3_0=ruleNativeClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodOperationRule());
              	        }
                     		set(
                     			current, 
                     			"class",
                      		lv_class_3_0, 
                      		"NativeClass");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleMethodOperation2017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:878:1: ( (lv_method_5_0= ruleNativeMethod ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:879:1: (lv_method_5_0= ruleNativeMethod )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:879:1: (lv_method_5_0= ruleNativeMethod )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:880:3: lv_method_5_0= ruleNativeMethod
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNativeMethod_in_ruleMethodOperation2038);
            lv_method_5_0=ruleNativeMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodOperationRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_5_0, 
                      		"NativeMethod");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodOperation"


    // $ANTLR start "entryRuleNativeMethod"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:904:1: entryRuleNativeMethod returns [EObject current=null] : iv_ruleNativeMethod= ruleNativeMethod EOF ;
    public final EObject entryRuleNativeMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeMethod = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:905:2: (iv_ruleNativeMethod= ruleNativeMethod EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:906:2: iv_ruleNativeMethod= ruleNativeMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeMethodRule()); 
            }
            pushFollow(FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod2074);
            iv_ruleNativeMethod=ruleNativeMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeMethod2084); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNativeMethod"


    // $ANTLR start "ruleNativeMethod"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:913:1: ruleNativeMethod returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNativeMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:916:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:917:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:917:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:918:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:918:1: (lv_name_0_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:919:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNativeMethod2125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNativeMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeMethod"


    // $ANTLR start "entryRuleXExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:943:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:944:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:945:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2165);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:952:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:955:28: (this_XAssignment_0= ruleXAssignment )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:957:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2221);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:973:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:974:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:975:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2255);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2265); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:982:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:985:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:986:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:986:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_ID && LA11_1<=RULE_STRING)||(LA11_1>=14 && LA11_1<=16)||(LA11_1>=23 && LA11_1<=47)||(LA11_1>=49 && LA11_1<=75)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==20) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||LA11_0==31||(LA11_0>=34 && LA11_0<=35)||LA11_0==40||LA11_0==45||LA11_0==47||LA11_0==50||LA11_0==52||LA11_0==54||(LA11_0>=58 && LA11_0<=60)||LA11_0==63||(LA11_0>=65 && LA11_0<=72)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:986:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:986:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:986:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:986:3: ()
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:987:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:992:2: ( ( ruleValidID ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:993:1: ( ruleValidID )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:993:1: ( ruleValidID )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:994:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2323);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2339);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1015:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1016:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1016:1: (lv_value_3_0= ruleXAssignment )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1017:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2359);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1034:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1034:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1035:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2389);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalFlow()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1048:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1048:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1048:7: ()
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1049:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1054:2: ( ( ruleOpMultiAssign ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1055:1: ( ruleOpMultiAssign )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1055:1: ( ruleOpMultiAssign )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1056:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2442);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1069:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1070:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1070:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1071:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2465);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1095:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1096:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1097:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2505);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2516); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1104:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1107:28: (kw= '=' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1109:2: kw= '='
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpSingleAssign2553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1122:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1123:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1124:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2593);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1131:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1134:28: (kw= '+=' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1136:2: kw= '+='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign2641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1149:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1150:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1151:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2680);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2690); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1158:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1161:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1162:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1162:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1163:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2737);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalFlow()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1176:6: ( () ( ( ruleOpOr ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1176:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1176:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1177:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1182:2: ( ( ruleOpOr ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1183:1: ( ruleOpOr )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1183:1: ( ruleOpOr )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1184:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2790);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1197:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1198:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1198:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1199:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2813);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1223:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1224:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1225:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2852);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2863); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1232:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1235:28: (kw= '||' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1237:2: kw= '||'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOr2900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1250:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1251:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1252:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2939);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2949); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1259:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1262:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1263:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1263:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1264:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2996);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalFlow()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1277:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1277:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1277:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1278:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1283:2: ( ( ruleOpAnd ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1284:1: ( ruleOpAnd )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1284:1: ( ruleOpAnd )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1285:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3049);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1298:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1299:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1299:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1300:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3072);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1324:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1325:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1326:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3111);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1333:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1336:28: (kw= '&&' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1338:2: kw= '&&'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpAnd3159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1351:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1352:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1353:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3198);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3208); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1360:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1363:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1364:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1364:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1365:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3255);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalFlow()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==27) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalFlow()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1378:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1378:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1378:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1379:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1384:2: ( ( ruleOpEquality ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1385:1: ( ruleOpEquality )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1385:1: ( ruleOpEquality )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1386:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3308);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1399:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1400:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1400:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1401:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3331);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1425:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1426:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1427:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3370);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3381); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1434:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1437:28: ( (kw= '==' | kw= '!=' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1438:1: (kw= '==' | kw= '!=' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1438:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1439:2: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality3419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1446:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality3438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1459:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1460:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1461:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3478);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3488); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1468:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1471:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1472:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1472:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1473:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3535);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred5_InternalFlow()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalFlow()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred6_InternalFlow()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalFlow()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalFlow()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1483:5: ( () otherlv_2= 'instanceof' )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1483:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1483:6: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1484:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression3571); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1493:3: ( ( ruleQualifiedName ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1494:1: ( ruleQualifiedName )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1494:1: ( ruleQualifiedName )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1495:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3596);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1514:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1514:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1514:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1515:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1520:2: ( ( ruleOpCompare ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1521:1: ( ruleOpCompare )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1521:1: ( ruleOpCompare )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1522:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3657);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1535:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1536:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1536:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1537:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3680);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1561:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1562:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1563:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3720);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1570:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1573:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1574:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1574:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 14:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1575:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare3769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1582:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare3788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1589:2: kw= '>'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleOpCompare3807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1596:2: kw= '<'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare3826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1609:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1610:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1611:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3866);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3876); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1618:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1621:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1622:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1622:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1623:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3923);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred7_InternalFlow()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==33) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred7_InternalFlow()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1636:6: ( () ( ( ruleOpOther ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1636:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1636:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1637:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1642:2: ( ( ruleOpOther ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1643:1: ( ruleOpOther )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1643:1: ( ruleOpOther )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1644:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3976);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1657:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1658:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1658:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1659:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3999);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1683:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1684:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1685:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4038);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4049); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1692:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1695:28: ( (kw= '->' | kw= '..' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1696:1: (kw= '->' | kw= '..' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1696:1: (kw= '->' | kw= '..' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1697:2: kw= '->'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther4087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1704:2: kw= '..'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther4106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1717:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1718:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1719:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4146);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4156); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1726:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1729:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1730:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1730:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1731:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4203);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred8_InternalFlow()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==35) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred8_InternalFlow()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1744:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1744:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1744:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1745:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1750:2: ( ( ruleOpAdd ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1751:1: ( ruleOpAdd )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1751:1: ( ruleOpAdd )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1752:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4256);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1765:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1766:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1766:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1767:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4279);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1791:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1792:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1793:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4318);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4329); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1800:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1803:28: ( (kw= '+' | kw= '-' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1804:1: (kw= '+' | kw= '-' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1804:1: (kw= '+' | kw= '-' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1805:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd4367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1812:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd4386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1825:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1826:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1827:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4426);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1834:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1837:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1838:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1838:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1839:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4483);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred9_InternalFlow()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred9_InternalFlow()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred9_InternalFlow()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred9_InternalFlow()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1852:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1852:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1852:7: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1853:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1858:2: ( ( ruleOpMulti ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1859:1: ( ruleOpMulti )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1859:1: ( ruleOpMulti )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1860:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4536);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1873:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1874:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1874:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1875:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4559);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1899:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1900:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1901:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4598);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4609); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1908:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1911:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1912:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1912:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 38:
                {
                alt23=3;
                }
                break;
            case 39:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1913:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti4647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1920:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti4666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1927:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti4685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1934:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti4704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1947:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1948:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1949:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4744);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4754); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1956:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1959:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1960:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1960:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=34 && LA24_0<=35)||LA24_0==40) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==31||LA24_0==45||LA24_0==47||LA24_0==50||LA24_0==52||LA24_0==54||(LA24_0>=58 && LA24_0<=60)||LA24_0==63||(LA24_0>=65 && LA24_0<=72)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1960:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1960:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1960:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1960:3: ()
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1961:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1966:2: ( ( ruleOpUnary ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1967:1: ( ruleOpUnary )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1967:1: ( ruleOpUnary )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1968:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4812);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1981:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1982:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1982:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1983:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4833);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2001:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4862);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2017:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2018:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2019:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4898);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4909); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2026:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2029:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2030:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2030:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt25=1;
                }
                break;
            case 35:
                {
                alt25=2;
                }
                break;
            case 34:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2031:2: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2038:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary4966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2045:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary4985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2058:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2059:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2060:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5025);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5035); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2067:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2070:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2071:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2071:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2072:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5082);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred10_InternalFlow()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2082:5: ( () otherlv_2= 'as' )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2082:6: () otherlv_2= 'as'
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2082:6: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2083:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression5117); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2092:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2093:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2093:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2094:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5140);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2118:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2119:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2120:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5178);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5188); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2127:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2130:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2131:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2131:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2132:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5235);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop34:
            do {
                int alt34=3;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred11_InternalFlow()) ) {
                        alt34=1;
                    }
                    else if ( (synpred12_InternalFlow()) ) {
                        alt34=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred12_InternalFlow()) ) {
                        alt34=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred12_InternalFlow()) ) {
                        alt34=2;
                    }


                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2146:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2146:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2146:26: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2147:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall5284); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2156:1: ( ( ruleValidID ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2157:1: ( ruleValidID )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2157:1: ( ruleValidID )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2158:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5307);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5323);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2179:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2180:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2180:1: (lv_value_5_0= ruleXAssignment )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2181:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5345);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2214:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2214:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2214:8: ()
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2215:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2220:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2220:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall5431); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2225:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2225:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2226:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2226:1: (lv_nullSafe_8_0= '?.' )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2227:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall5455); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2241:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2241:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2242:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2242:1: (lv_spreading_9_0= '*.' )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2243:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall5492); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2256:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==31) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2256:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall5521); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2260:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2261:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2261:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2262:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5542);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2278:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==44) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2278:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall5555); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2282:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2283:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2283:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2284:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5576);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop28;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall5590); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2304:3: ( ( ruleValidID ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2305:1: ( ruleValidID )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2305:1: ( ruleValidID )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2306:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5615);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2319:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2319:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2319:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2319:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2326:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2327:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall5649); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt31=3;
            	            alt31 = dfa31.predict(input);
            	            switch (alt31) {
            	                case 1 :
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2357:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2358:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5734);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2375:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2375:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2375:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2375:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2376:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2376:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2377:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5762);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2393:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop30:
            	                    do {
            	                        int alt30=2;
            	                        int LA30_0 = input.LA(1);

            	                        if ( (LA30_0==44) ) {
            	                            alt30=1;
            	                        }


            	                        switch (alt30) {
            	                    	case 1 :
            	                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2393:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall5775); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2397:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2398:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2398:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2399:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5796);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop30;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall5813); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2419:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt33=2;
            	    alt33 = dfa33.predict(input);
            	    switch (alt33) {
            	        case 1 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2419:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2424:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2425:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5846);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2449:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2450:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2451:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5886);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5896); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2458:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2461:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2462:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2462:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt35=13;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt35=1;
                }
                break;
            case 54:
                {
                alt35=2;
                }
                break;
            case 52:
                {
                alt35=3;
                }
                break;
            case RULE_ID:
            case 31:
            case 63:
                {
                alt35=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 47:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt35=5;
                }
                break;
            case 50:
                {
                alt35=6;
                }
                break;
            case 58:
                {
                alt35=7;
                }
                break;
            case 59:
                {
                alt35=8;
                }
                break;
            case 60:
                {
                alt35=9;
                }
                break;
            case 70:
                {
                alt35=10;
                }
                break;
            case 71:
                {
                alt35=11;
                }
                break;
            case 72:
                {
                alt35=12;
                }
                break;
            case 45:
                {
                alt35=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2463:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5943);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2473:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5970);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2483:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5997);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2493:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6024);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2503:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6051);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2513:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6078);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2523:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6105);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2533:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6132);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2543:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6159);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2553:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6186);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2563:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6213);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2573:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6240);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2583:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6267);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2599:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2600:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2601:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6302);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6312); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2608:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2611:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2612:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2612:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt36=1;
                }
                break;
            case 66:
            case 67:
                {
                alt36=2;
                }
                break;
            case RULE_INT:
                {
                alt36=3;
                }
                break;
            case 68:
                {
                alt36=4;
                }
                break;
            case RULE_STRING:
                {
                alt36=5;
                }
                break;
            case 69:
                {
                alt36=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2613:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6359);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2623:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6386);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2633:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6413);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2643:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6440);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2653:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6467);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2663:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6494);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2679:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2680:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2681:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6529);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6539); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2688:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2691:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2692:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2692:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2692:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2692:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2693:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXClosure6585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2717:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2717:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2717:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID||LA38_0==45||LA38_0==75) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2717:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2717:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2718:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2718:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2719:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6656);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2735:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==44) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2735:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXClosure6669); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2739:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2740:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2740:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2741:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6690);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2757:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2758:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2758:1: (lv_explicitSyntax_5_0= '|' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2759:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,48,FOLLOW_48_in_ruleXClosure6712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2772:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2773:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2773:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2774:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6749);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXClosure6761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2802:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2803:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2804:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6797);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6807); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2811:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2814:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2815:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2815:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2815:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2815:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2816:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2821:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==31||(LA41_0>=34 && LA41_0<=35)||LA41_0==40||LA41_0==45||LA41_0==47||LA41_0==50||LA41_0==52||LA41_0==54||(LA41_0>=58 && LA41_0<=63)||(LA41_0>=65 && LA41_0<=72)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2821:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2821:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2822:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2822:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2823:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6863);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2839:2: (otherlv_2= ';' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==15) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2839:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXExpressionInClosure6876); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2851:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2852:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2853:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6916);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6926); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2860:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2863:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2864:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2864:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2864:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2864:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2864:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2880:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2880:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2880:7: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2881:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2886:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==45||LA43_0==75) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2886:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2886:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2887:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2887:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2888:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7034);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2904:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==44) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2904:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXShortClosure7047); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2908:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2909:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2909:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2910:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7068);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2926:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2927:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2927:1: (lv_explicitSyntax_4_0= '|' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2928:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure7090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2941:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2942:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2942:1: (lv_expression_5_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2943:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7126);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2967:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2968:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2969:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7162);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7172); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2976:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2979:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2980:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2980:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2980:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression7209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7231);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression7242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3005:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3006:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3007:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7278);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3014:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3017:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3018:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3018:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3018:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3018:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3019:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression7334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression7346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3032:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3033:1: (lv_if_3_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3033:1: (lv_if_3_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3034:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7367);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression7379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3054:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3055:1: (lv_then_5_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3055:1: (lv_then_5_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3056:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7400);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3072:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred18_InternalFlow()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3072:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3072:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3072:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression7421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3077:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3078:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3078:1: (lv_else_7_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3079:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7443);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3103:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3104:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3105:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7481);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7491); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3112:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3115:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3116:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3116:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3116:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3116:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression7537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==53) && (synpred19_InternalFlow())) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3131:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3131:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3131:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3132:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3132:1: (lv_localVarName_2_0= ruleValidID )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3133:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7578);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression7590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3153:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3154:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3154:1: (lv_switch_4_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3155:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7614);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3175:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==45||LA46_0==53||LA46_0==57||LA46_0==75) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3176:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3176:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3177:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7647);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3193:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3193:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression7673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3201:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3202:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3202:1: (lv_default_9_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3203:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7694);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression7708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3231:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3232:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3233:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7744);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7754); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3240:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3243:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3244:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3244:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3244:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3244:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==45||LA48_0==75) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3245:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3245:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3246:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7800);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3262:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3262:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart7814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3266:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3267:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3267:1: (lv_case_2_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3268:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7835);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart7849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3288:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3289:1: (lv_then_4_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3289:1: (lv_then_4_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3290:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7870);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3314:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3315:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3316:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7906);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3323:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3326:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3327:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3327:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3327:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3327:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3328:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression7962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression7974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3341:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3342:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3342:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3343:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7995);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression8007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3363:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3364:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3364:1: (lv_forExpression_5_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3365:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8028);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression8040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3385:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3386:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3386:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3387:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8061);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3411:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3412:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3413:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8097);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3420:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3423:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3424:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3424:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3424:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3424:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3425:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXWhileExpression8153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression8165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3438:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3439:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3439:1: (lv_predicate_3_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3440:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8186);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression8198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3460:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3461:1: (lv_body_5_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3461:1: (lv_body_5_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3462:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8219);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3486:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3487:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3488:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8255);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8265); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3495:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3498:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3499:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3499:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3499:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3499:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3500:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression8311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3509:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3510:1: (lv_body_2_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3510:1: (lv_body_2_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3511:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8332);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression8344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression8356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3535:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3536:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3536:1: (lv_predicate_5_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3537:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8377);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression8389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3565:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3566:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3567:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8425);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8435); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3574:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3577:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3578:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3578:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3578:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3578:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3579:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression8481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3588:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)||LA51_0==31||(LA51_0>=34 && LA51_0<=35)||LA51_0==40||LA51_0==45||LA51_0==47||LA51_0==50||LA51_0==52||LA51_0==54||(LA51_0>=58 && LA51_0<=63)||(LA51_0>=65 && LA51_0<=72)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3588:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3588:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3589:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3589:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3590:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8503);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3606:2: (otherlv_3= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==15) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3606:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression8516); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression8532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3622:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3623:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3624:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8568);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8578); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3631:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3634:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3635:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3635:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=61 && LA52_0<=62)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==31||(LA52_0>=34 && LA52_0<=35)||LA52_0==40||LA52_0==45||LA52_0==47||LA52_0==50||LA52_0==52||LA52_0==54||(LA52_0>=58 && LA52_0<=60)||LA52_0==63||(LA52_0>=65 && LA52_0<=72)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3636:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8625);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3646:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8652);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3662:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3663:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3664:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8687);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8697); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3671:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3674:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3675:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3675:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3675:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3675:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3681:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==61) ) {
                alt53=1;
            }
            else if ( (LA53_0==62) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3681:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3681:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3682:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3682:1: (lv_writeable_1_0= 'var' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3683:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration8750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3697:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration8781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred20_InternalFlow()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==45) && (synpred20_InternalFlow())) {
                alt54=1;
            }
            else if ( (LA54_0==75) && (synpred20_InternalFlow())) {
                alt54=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3709:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3709:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3709:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3710:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3710:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3711:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8829);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3727:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3728:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3728:1: (lv_name_4_0= ruleValidID )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3729:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8850);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3746:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3746:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3747:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3747:1: (lv_name_5_0= ruleValidID )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3748:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8879);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3764:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3764:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleXVariableDeclaration8893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3768:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3769:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3769:1: (lv_right_7_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3770:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8914);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3794:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3795:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3796:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8952);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8962); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3803:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3806:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3807:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3807:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3807:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3807:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_ID||LA56_1==16||LA56_1==31||LA56_1==47) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==45||LA56_0==75) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3808:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3808:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3809:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9008);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3825:3: ( (lv_name_1_0= ruleValidID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3826:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3826:1: (lv_name_1_0= ruleValidID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3827:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9030);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3851:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3852:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3853:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9066);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9076); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3860:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3863:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3864:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3864:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3864:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3864:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3865:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3865:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3866:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9122);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3882:2: ( (lv_name_1_0= ruleValidID ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3883:1: (lv_name_1_0= ruleValidID )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3883:1: (lv_name_1_0= ruleValidID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3884:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9143);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3908:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3909:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3910:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9179);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9189); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3917:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3920:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3921:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3921:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3921:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3921:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3927:2: ( ( ruleStaticQualifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==64) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3928:1: ( ruleStaticQualifier )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3928:1: ( ruleStaticQualifier )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3929:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9246);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3942:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==31) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3942:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall9260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3946:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3947:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3947:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3948:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9281);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3964:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==44) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3964:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall9294); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3968:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3969:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3969:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3970:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9315);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleXFeatureCall9329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3990:3: ( ( ruleIdOrSuper ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3991:1: ( ruleIdOrSuper )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3991:1: ( ruleIdOrSuper )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3992:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9354);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4005:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4005:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4005:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4005:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4012:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4013:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall9388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt61=3;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4043:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4044:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9473);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4061:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4061:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4061:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4061:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4062:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4062:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4063:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9501);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4079:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==44) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4079:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall9514); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4083:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4084:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4084:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4085:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9535);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall9552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4105:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4105:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4110:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4111:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9585);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4135:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4136:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4137:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9623);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9634); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4144:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4147:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4148:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4148:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==63) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4149:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9681);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4161:2: kw= 'super'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleIdOrSuper9705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4174:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4175:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4176:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9746);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9757); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4183:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4186:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4187:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4187:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==64) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4188:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9804);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleStaticQualifier9822); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4212:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4213:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4214:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9863);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4221:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4224:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4225:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4225:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4225:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4225:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXConstructorCall9919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4235:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4236:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4236:1: ( ruleQualifiedName )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4237:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9942);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4250:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==31) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4250:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall9955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4254:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4255:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4255:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4256:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9976);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4272:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==44) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4272:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall9989); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4276:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4277:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4277:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4278:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10010);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXConstructorCall10024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall10038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt69=3;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4319:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4320:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10110);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4337:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4337:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4337:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4337:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4338:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4338:1: (lv_arguments_10_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4339:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10138);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4355:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==44) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4355:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall10151); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4359:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4360:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4360:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4361:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10172);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall10189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4381:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4381:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4386:1: (lv_arguments_14_0= ruleXClosure )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4387:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall10220);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4411:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4412:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4413:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10257);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10267); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4420:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4423:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4424:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4424:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4424:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4424:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4425:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4430:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==66) ) {
                alt71=1;
            }
            else if ( (LA71_0==67) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4430:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral10314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4435:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4435:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4436:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4436:1: (lv_isTrue_2_0= 'true' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4437:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral10338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4458:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4459:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4460:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10388);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10398); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4467:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4470:28: ( ( () otherlv_1= 'null' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4471:1: ( () otherlv_1= 'null' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4471:1: ( () otherlv_1= 'null' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4471:2: () otherlv_1= 'null'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4471:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4472:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXNullLiteral10444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4489:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4490:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4491:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10480);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral10490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4498:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4501:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4502:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4502:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4502:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4502:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4508:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4509:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4509:1: (lv_value_1_0= RULE_INT )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4510:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral10541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4534:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4535:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4536:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10582);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10592); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4543:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4546:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4547:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4547:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4547:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4547:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4548:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4553:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4554:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4554:1: (lv_value_1_0= RULE_STRING )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4555:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4579:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4580:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4581:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10684);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4588:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4591:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4592:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4592:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4592:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4592:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4593:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXTypeLiteral10740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral10752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4606:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4607:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4607:1: ( ruleQualifiedName )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4608:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10775);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral10787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4633:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4634:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4635:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10823);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10833); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4642:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4645:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4646:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4646:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4646:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4646:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4647:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXThrowExpression10879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4656:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4657:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4657:1: (lv_expression_2_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4658:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10900);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4682:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4683:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4684:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10936);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10946); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4691:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4694:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4695:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4695:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4695:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4695:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4696:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXReturnExpression10992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4705:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4705:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4710:1: (lv_expression_2_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4711:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11023);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4735:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4736:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4737:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11060);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11070); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4744:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4747:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4748:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4748:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4748:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4748:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4749:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression11116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4758:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4759:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4759:1: (lv_expression_2_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4760:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11137);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==74) ) {
                alt75=1;
            }
            else if ( (LA75_0==73) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==74) ) {
                            int LA73_2 = input.LA(2);

                            if ( (synpred27_InternalFlow()) ) {
                                alt73=1;
                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4778:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4779:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11167);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4795:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==73) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred28_InternalFlow()) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4795:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4795:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4795:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression11189); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4800:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4801:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4801:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4802:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11211);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4819:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4819:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4819:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression11233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4823:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4824:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4824:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4825:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11254);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4849:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4850:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4851:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11292);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11302); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4858:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4861:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4862:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4862:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4862:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4862:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4862:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleXCatchClause11347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause11360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4871:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4872:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4872:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4873:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11381);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause11393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4893:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4894:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4894:1: (lv_expression_4_0= ruleXExpression )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4895:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11414);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4919:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4920:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4921:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11451);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11462); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4928:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4931:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4932:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4932:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4933:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11509);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4943:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==16) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==RULE_ID) ) {
                        int LA76_3 = input.LA(3);

                        if ( (synpred30_InternalFlow()) ) {
                            alt76=1;
                        }


                    }


                }


                switch (alt76) {
            	case 1 :
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4943:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4943:2: ( ( '.' )=>kw= '.' )
            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4943:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName11537); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11560);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4970:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4971:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4972:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11607);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11617); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4979:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4982:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4983:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4983:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==45||LA78_0==75) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4983:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4983:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4984:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11665);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==47) ) {
                            int LA77_2 = input.LA(2);

                            if ( (LA77_2==49) ) {
                                int LA77_3 = input.LA(3);

                                if ( (synpred31_InternalFlow()) ) {
                                    alt77=1;
                                }


                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4995:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4995:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4995:6: ()
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4996:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference11703); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference11715); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5011:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11747);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5027:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5028:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5029:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11782);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5036:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5039:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5040:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5040:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5040:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5040:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==45) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5040:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef11830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5044:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==45||LA80_0==75) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5044:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5044:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5045:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5045:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5046:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11852);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5062:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==44) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5062:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef11865); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5066:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5067:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5067:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5068:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11886);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef11902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleXFunctionTypeRef11916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5092:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5093:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5093:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5094:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11937);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5118:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5119:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5120:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11973);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11983); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5127:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5130:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5131:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5131:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5131:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5131:2: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5132:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5132:1: ( ruleQualifiedName )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5133:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12031);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5146:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5146:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5146:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5146:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference12052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5151:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5152:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5152:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5153:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12074);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5169:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==44) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5169:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleJvmParameterizedTypeReference12087); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5173:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5174:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5174:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5175:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12108);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleJvmParameterizedTypeReference12122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5203:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5204:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5205:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12160);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12170); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5212:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5215:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5216:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5216:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==45||LA84_0==75) ) {
                alt84=1;
            }
            else if ( (LA84_0==76) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5217:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12217);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5227:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12244);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5243:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5244:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5245:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12279);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12289); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5252:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5255:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5256:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5256:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5256:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5256:2: ()
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5257:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference12335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5266:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==77) ) {
                alt85=1;
            }
            else if ( (LA85_0==63) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5266:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5266:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5267:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5267:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5268:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12357);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5285:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5285:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5286:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5286:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5287:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12384);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5311:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5312:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5313:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12422);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12432); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5320:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5323:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5324:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5324:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5324:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound12469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5328:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5329:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5329:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5330:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12490);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5354:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5355:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5356:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12526);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12536); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5363:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5366:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5367:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5367:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5367:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded12573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5371:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5372:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5372:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5373:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12594);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5397:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5398:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5399:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12630);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5406:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5409:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5410:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5410:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5410:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmLowerBound12677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5414:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5415:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5415:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5416:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12698);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5442:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5443:2: (iv_ruleValidID= ruleValidID EOF )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5444:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12737);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12748); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5451:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5454:28: (this_ID_0= RULE_ID )
            // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5455:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalFlow
    public final void synpred1_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1043:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1044:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1044:2: ( ( ruleOpMultiAssign ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1045:1: ( ruleOpMultiAssign )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1045:1: ( ruleOpMultiAssign )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1046:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFlow2410);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalFlow

    // $ANTLR start synpred2_InternalFlow
    public final void synpred2_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:4: ( () ( ( ruleOpOr ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:5: () ( ( ruleOpOr ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1171:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1172:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1172:2: ( ( ruleOpOr ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1173:1: ( ruleOpOr )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1173:1: ( ruleOpOr )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1174:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFlow2758);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFlow

    // $ANTLR start synpred3_InternalFlow
    public final void synpred3_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:4: ( () ( ( ruleOpAnd ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:5: () ( ( ruleOpAnd ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1272:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1273:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1273:2: ( ( ruleOpAnd ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1274:1: ( ruleOpAnd )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1274:1: ( ruleOpAnd )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1275:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFlow3017);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalFlow

    // $ANTLR start synpred4_InternalFlow
    public final void synpred4_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:4: ( () ( ( ruleOpEquality ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:5: () ( ( ruleOpEquality ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1373:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1374:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1374:2: ( ( ruleOpEquality ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1375:1: ( ruleOpEquality )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1375:1: ( ruleOpEquality )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1376:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFlow3276);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalFlow

    // $ANTLR start synpred5_InternalFlow
    public final void synpred5_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:4: ( ( () 'instanceof' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:5: ( () 'instanceof' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:5: ( () 'instanceof' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:6: () 'instanceof'
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1481:6: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1482:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred5_InternalFlow3552); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFlow

    // $ANTLR start synpred6_InternalFlow
    public final void synpred6_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:9: ( () ( ( ruleOpCompare ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:10: () ( ( ruleOpCompare ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1509:10: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1510:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1510:2: ( ( ruleOpCompare ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1511:1: ( ruleOpCompare )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1511:1: ( ruleOpCompare )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1512:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFlow3625);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalFlow

    // $ANTLR start synpred7_InternalFlow
    public final void synpred7_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:4: ( () ( ( ruleOpOther ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:5: () ( ( ruleOpOther ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1631:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1632:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1632:2: ( ( ruleOpOther ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1633:1: ( ruleOpOther )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1633:1: ( ruleOpOther )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1634:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFlow3944);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalFlow

    // $ANTLR start synpred8_InternalFlow
    public final void synpred8_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:4: ( () ( ( ruleOpAdd ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:5: () ( ( ruleOpAdd ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1739:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1740:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1740:2: ( ( ruleOpAdd ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1741:1: ( ruleOpAdd )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1741:1: ( ruleOpAdd )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1742:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalFlow4224);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalFlow

    // $ANTLR start synpred9_InternalFlow
    public final void synpred9_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:4: ( () ( ( ruleOpMulti ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:5: () ( ( ruleOpMulti ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1847:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1848:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1848:2: ( ( ruleOpMulti ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1849:1: ( ruleOpMulti )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1849:1: ( ruleOpMulti )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:1850:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalFlow4504);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalFlow

    // $ANTLR start synpred10_InternalFlow
    public final void synpred10_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:3: ( ( () 'as' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:4: ( () 'as' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:4: ( () 'as' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:5: () 'as'
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2080:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2081:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred10_InternalFlow5098); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalFlow

    // $ANTLR start synpred11_InternalFlow
    public final void synpred11_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2140:6: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2141:1: 
        {
        }

        match(input,16,FOLLOW_16_in_synpred11_InternalFlow5252); if (state.failed) return ;
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2142:1: ( ( ruleValidID ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2143:1: ( ruleValidID )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2143:1: ( ruleValidID )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2144:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalFlow5261);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFlow5267);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalFlow

    // $ANTLR start synpred12_InternalFlow
    public final void synpred12_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2198:10: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2199:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2199:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt86=3;
        switch ( input.LA(1) ) {
        case 16:
            {
            alt86=1;
            }
            break;
        case 42:
            {
            alt86=2;
            }
            break;
        case 43:
            {
            alt86=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }

        switch (alt86) {
            case 1 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2199:4: '.'
                {
                match(input,16,FOLLOW_16_in_synpred12_InternalFlow5370); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2201:6: ( ( '?.' ) )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2201:6: ( ( '?.' ) )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2202:1: ( '?.' )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2202:1: ( '?.' )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2203:2: '?.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalFlow5384); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2208:6: ( ( '*.' ) )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2208:6: ( ( '*.' ) )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2209:1: ( '*.' )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2209:1: ( '*.' )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2210:2: '*.'
                {
                match(input,43,FOLLOW_43_in_synpred12_InternalFlow5404); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalFlow

    // $ANTLR start synpred13_InternalFlow
    public final void synpred13_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2319:4: ( ( '(' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2320:1: ( '(' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2320:1: ( '(' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2321:2: '('
        {
        match(input,45,FOLLOW_45_in_synpred13_InternalFlow5631); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFlow

    // $ANTLR start synpred14_InternalFlow
    public final void synpred14_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2340:6: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2341:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2341:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==45||LA88_0==75) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2341:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2341:3: ( ( ruleJvmFormalParameter ) )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2342:1: ( ruleJvmFormalParameter )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2342:1: ( ruleJvmFormalParameter )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2343:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFlow5683);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2345:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==44) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2345:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred14_InternalFlow5690); if (state.failed) return ;
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2346:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2347:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2347:1: ( ruleJvmFormalParameter )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2348:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFlow5697);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2350:6: ( ( '|' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2351:1: ( '|' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2351:1: ( '|' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2352:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred14_InternalFlow5711); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalFlow

    // $ANTLR start synpred15_InternalFlow
    public final void synpred15_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2419:4: ( ( ruleXClosure ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2420:1: ( ruleXClosure )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2420:1: ( ruleXClosure )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2421:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalFlow5829);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalFlow

    // $ANTLR start synpred16_InternalFlow
    public final void synpred16_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==45||LA90_0==75) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2702:5: ( ( ruleJvmFormalParameter ) )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2703:1: ( ruleJvmFormalParameter )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2703:1: ( ruleJvmFormalParameter )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2704:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFlow6602);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2706:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==44) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2706:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred16_InternalFlow6609); if (state.failed) return ;
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2707:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2708:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2708:1: ( ruleJvmFormalParameter )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2709:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFlow6616);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2711:6: ( ( '|' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2712:1: ( '|' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2712:1: ( '|' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:2713:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalFlow6630); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalFlow

    // $ANTLR start synpred18_InternalFlow
    public final void synpred18_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3072:4: ( 'else' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3072:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred18_InternalFlow7413); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalFlow

    // $ANTLR start synpred19_InternalFlow
    public final void synpred19_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:3: ( ( ( ruleValidID ) ) ':' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:4: ( ( ruleValidID ) ) ':'
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3126:4: ( ( ruleValidID ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3127:1: ( ruleValidID )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3127:1: ( ruleValidID )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3128:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalFlow7553);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,53,FOLLOW_53_in_synpred19_InternalFlow7559); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalFlow

    // $ANTLR start synpred20_InternalFlow
    public final void synpred20_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3701:6: ( ( ruleJvmTypeReference ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3702:1: ( ruleJvmTypeReference )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3702:1: ( ruleJvmTypeReference )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3703:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalFlow8799);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3705:2: ( ( ruleValidID ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3706:1: ( ruleValidID )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3706:1: ( ruleValidID )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:3707:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalFlow8808);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalFlow

    // $ANTLR start synpred21_InternalFlow
    public final void synpred21_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4005:4: ( ( '(' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4006:1: ( '(' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4006:1: ( '(' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4007:2: '('
        {
        match(input,45,FOLLOW_45_in_synpred21_InternalFlow9370); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalFlow

    // $ANTLR start synpred22_InternalFlow
    public final void synpred22_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4026:6: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4027:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4027:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==45||LA94_0==75) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4027:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4027:3: ( ( ruleJvmFormalParameter ) )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4028:1: ( ruleJvmFormalParameter )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4028:1: ( ruleJvmFormalParameter )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4029:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFlow9422);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4031:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==44) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4031:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred22_InternalFlow9429); if (state.failed) return ;
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4032:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4033:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4033:1: ( ruleJvmFormalParameter )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4034:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFlow9436);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4036:6: ( ( '|' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4037:1: ( '|' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4037:1: ( '|' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4038:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred22_InternalFlow9450); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalFlow

    // $ANTLR start synpred23_InternalFlow
    public final void synpred23_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4105:4: ( ( ruleXClosure ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4106:1: ( ruleXClosure )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4106:1: ( ruleXClosure )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4107:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalFlow9568);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalFlow

    // $ANTLR start synpred24_InternalFlow
    public final void synpred24_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4302:5: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4303:1: 
        {
        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4303:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==45||LA96_0==75) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4303:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4303:3: ( ( ruleJvmFormalParameter ) )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4304:1: ( ruleJvmFormalParameter )
                {
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4304:1: ( ruleJvmFormalParameter )
                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4305:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFlow10059);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4307:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==44) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4307:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,44,FOLLOW_44_in_synpred24_InternalFlow10066); if (state.failed) return ;
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4308:1: ( ( ruleJvmFormalParameter ) )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4309:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4309:1: ( ruleJvmFormalParameter )
                	    // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4310:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFlow10073);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4312:6: ( ( '|' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4313:1: ( '|' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4313:1: ( '|' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4314:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred24_InternalFlow10087); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalFlow

    // $ANTLR start synpred25_InternalFlow
    public final void synpred25_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4381:2: ( ( ruleXClosure ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4382:1: ( ruleXClosure )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4382:1: ( ruleXClosure )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4383:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalFlow10203);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalFlow

    // $ANTLR start synpred26_InternalFlow
    public final void synpred26_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4705:2: ( ( ruleXExpression ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4706:1: ( ruleXExpression )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4706:1: ( ruleXExpression )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4707:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalFlow11006);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalFlow

    // $ANTLR start synpred27_InternalFlow
    public final void synpred27_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:5: ( 'catch' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4776:7: 'catch'
        {
        match(input,74,FOLLOW_74_in_synpred27_InternalFlow11151); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalFlow

    // $ANTLR start synpred28_InternalFlow
    public final void synpred28_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4795:5: ( 'finally' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4795:7: 'finally'
        {
        match(input,73,FOLLOW_73_in_synpred28_InternalFlow11181); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalFlow

    // $ANTLR start synpred30_InternalFlow
    public final void synpred30_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4943:3: ( '.' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4944:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred30_InternalFlow11528); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalFlow

    // $ANTLR start synpred31_InternalFlow
    public final void synpred31_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:2: ( ( () '[' ']' ) )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:3: ( () '[' ']' )
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:3: ( () '[' ']' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:4: () '[' ']'
        {
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4992:4: ()
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:4993:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred31_InternalFlow11680); if (state.failed) return ;
        match(input,49,FOLLOW_49_in_synpred31_InternalFlow11684); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalFlow

    // $ANTLR start synpred32_InternalFlow
    public final void synpred32_InternalFlow_fragment() throws RecognitionException {   
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5146:4: ( '<' )
        // ../de.grammarcraft.flow/src-gen/de/grammarcraft/flow/parser/antlr/internal/InternalFlow.g:5146:6: '<'
        {
        match(input,31,FOLLOW_31_in_synpred32_InternalFlow12044); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalFlow

    // Delegated rules

    public final boolean synpred5_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalFlow() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalFlow_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA32_eotS =
        "\74\uffff";
    static final String DFA32_eofS =
        "\1\2\73\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA32_maxS =
        "\1\113\1\0\72\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\2\7\uffff\3\2\6\uffff\26\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2319:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\34\uffff";
    static final String DFA31_eofS =
        "\34\uffff";
    static final String DFA31_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA31_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA31_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA31_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\2\5\30\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "2340:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_0==RULE_ID) ) {s = 1;}

                        else if ( (LA31_0==45) ) {s = 2;}

                        else if ( (LA31_0==75) && (synpred14_InternalFlow())) {s = 3;}

                        else if ( (LA31_0==48) && (synpred14_InternalFlow())) {s = 4;}

                        else if ( ((LA31_0>=RULE_INT && LA31_0<=RULE_STRING)||LA31_0==31||(LA31_0>=34 && LA31_0<=35)||LA31_0==40||LA31_0==47||LA31_0==50||LA31_0==52||LA31_0==54||(LA31_0>=58 && LA31_0<=60)||LA31_0==63||(LA31_0>=65 && LA31_0<=72)) ) {s = 5;}

                        else if ( (LA31_0==46) ) {s = 27;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\74\uffff";
    static final String DFA33_eofS =
        "\1\2\73\uffff";
    static final String DFA33_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA33_maxS =
        "\1\113\1\0\72\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\2\7\uffff\3\2\6\uffff\30\2\1\1\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2419:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\36\uffff";
    static final String DFA39_eofS =
        "\36\uffff";
    static final String DFA39_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA39_maxS =
        "\1\113\2\0\33\uffff";
    static final String DFA39_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA39_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\2\5\30\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1"+
            "\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5\3\uffff\6\5\1\uffff"+
            "\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2702:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==RULE_ID) ) {s = 1;}

                        else if ( (LA39_0==45) ) {s = 2;}

                        else if ( (LA39_0==75) && (synpred16_InternalFlow())) {s = 3;}

                        else if ( (LA39_0==48) && (synpred16_InternalFlow())) {s = 4;}

                        else if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_STRING)||LA39_0==31||(LA39_0>=34 && LA39_0<=35)||LA39_0==40||LA39_0==47||(LA39_0>=49 && LA39_0<=50)||LA39_0==52||LA39_0==54||(LA39_0>=58 && LA39_0<=63)||(LA39_0>=65 && LA39_0<=72)) ) {s = 5;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\74\uffff";
    static final String DFA62_eofS =
        "\1\2\73\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA62_maxS =
        "\1\113\1\0\72\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA62_transitionS = {
            "\3\2\7\uffff\3\2\6\uffff\26\2\1\1\2\2\1\uffff\17\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "4005:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\34\uffff";
    static final String DFA61_eofS =
        "\34\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA61_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\1\2\5\30\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "4026:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==45) ) {s = 2;}

                        else if ( (LA61_0==75) && (synpred22_InternalFlow())) {s = 3;}

                        else if ( (LA61_0==48) && (synpred22_InternalFlow())) {s = 4;}

                        else if ( ((LA61_0>=RULE_INT && LA61_0<=RULE_STRING)||LA61_0==31||(LA61_0>=34 && LA61_0<=35)||LA61_0==40||LA61_0==47||LA61_0==50||LA61_0==52||LA61_0==54||(LA61_0>=58 && LA61_0<=60)||LA61_0==63||(LA61_0>=65 && LA61_0<=72)) ) {s = 5;}

                        else if ( (LA61_0==46) ) {s = 27;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\74\uffff";
    static final String DFA63_eofS =
        "\1\2\73\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA63_maxS =
        "\1\113\1\0\72\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA63_transitionS = {
            "\3\2\7\uffff\3\2\6\uffff\30\2\1\1\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "4105:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\34\uffff";
    static final String DFA69_eofS =
        "\34\uffff";
    static final String DFA69_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA69_maxS =
        "\1\113\2\0\31\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA69_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\1\2\5\30\uffff\1\5\2\uffff\2\5\4\uffff\1\5\4\uffff\1\2\1"+
            "\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4302:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_0 = input.LA(1);

                         
                        int index69_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_0==RULE_ID) ) {s = 1;}

                        else if ( (LA69_0==45) ) {s = 2;}

                        else if ( (LA69_0==75) && (synpred24_InternalFlow())) {s = 3;}

                        else if ( (LA69_0==48) && (synpred24_InternalFlow())) {s = 4;}

                        else if ( ((LA69_0>=RULE_INT && LA69_0<=RULE_STRING)||LA69_0==31||(LA69_0>=34 && LA69_0<=35)||LA69_0==40||LA69_0==47||LA69_0==50||LA69_0==52||LA69_0==54||(LA69_0>=58 && LA69_0<=60)||LA69_0==63||(LA69_0>=65 && LA69_0<=72)) ) {s = 5;}

                        else if ( (LA69_0==46) ) {s = 27;}

                         
                        input.seek(index69_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalFlow()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\74\uffff";
    static final String DFA70_eofS =
        "\1\2\73\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA70_maxS =
        "\1\113\1\0\72\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA70_transitionS = {
            "\3\2\7\uffff\3\2\6\uffff\30\2\1\1\1\uffff\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4381:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\74\uffff";
    static final String DFA72_eofS =
        "\1\31\73\uffff";
    static final String DFA72_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA72_maxS =
        "\1\113\30\0\43\uffff";
    static final String DFA72_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\15\1\17\7\uffff\3\31\6\uffff\10\31\1\10\2\31\1\4\1\3"+
            "\4\31\1\2\4\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31\1\7\1\31"+
            "\1\6\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16"+
            "\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4705:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA72_5 = input.LA(1);

                         
                        int index72_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA72_6 = input.LA(1);

                         
                        int index72_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA72_7 = input.LA(1);

                         
                        int index72_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA72_8 = input.LA(1);

                         
                        int index72_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA72_9 = input.LA(1);

                         
                        int index72_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA72_10 = input.LA(1);

                         
                        int index72_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA72_11 = input.LA(1);

                         
                        int index72_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA72_12 = input.LA(1);

                         
                        int index72_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA72_13 = input.LA(1);

                         
                        int index72_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA72_14 = input.LA(1);

                         
                        int index72_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA72_15 = input.LA(1);

                         
                        int index72_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA72_16 = input.LA(1);

                         
                        int index72_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA72_17 = input.LA(1);

                         
                        int index72_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA72_18 = input.LA(1);

                         
                        int index72_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA72_19 = input.LA(1);

                         
                        int index72_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA72_20 = input.LA(1);

                         
                        int index72_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA72_21 = input.LA(1);

                         
                        int index72_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA72_22 = input.LA(1);

                         
                        int index72_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA72_23 = input.LA(1);

                         
                        int index72_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA72_24 = input.LA(1);

                         
                        int index72_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFlow()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index72_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\100\uffff";
    static final String DFA83_eofS =
        "\1\2\77\uffff";
    static final String DFA83_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA83_maxS =
        "\1\113\1\0\76\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA83_transitionS = {
            "\3\2\6\uffff\4\2\2\uffff\1\2\1\uffff\12\2\1\1\20\2\1\uffff"+
            "\17\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "5146:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalFlow()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel144 = new BitSet(new long[]{0x0000000000283002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel167 = new BitSet(new long[]{0x0000000000283002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_ruleModel189 = new BitSet(new long[]{0x0000000000282002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUnit236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleFunctionUnit283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFunctionUnit310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFlow496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlow513 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_ruleStream_in_ruleFlow539 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_ruleStream632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStream644 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStream665 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStream677 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleRightPort_in_ruleStream698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStream710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_entryRuleLeftPort746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPort756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_ruleLeftPort803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_ruleLeftPort830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_ruleLeftPort857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInputPort902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGlobalInputPort939 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGlobalInputPort951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleUnnamedSubFlowPort1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_entryRuleRightPort1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPort1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_ruleRightPort1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_ruleRightPort1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_ruleRightPort1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalOutputPort1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGlobalOutputPort1281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGlobalOutputPort1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1393 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_rulePort1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_entryRuleNamedPort1451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPort1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNamedPort1498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedPort1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_ruleOperation1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_ruleOperation1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation1675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEbcOperation1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEbcOperation1722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEbcOperation1739 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEbcOperation1756 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleNativeClass_in_ruleEbcOperation1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_entryRuleNativeClass1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeClass1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleNativeClass1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodOperation1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMethodOperation1950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodOperation1967 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethodOperation1984 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleNativeClass_in_ruleMethodOperation2005 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMethodOperation2017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_ruleMethodOperation2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod2074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeMethod2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNativeMethod2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2339 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2389 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2442 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpSingleAssign2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2737 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2790 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2813 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOr2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2996 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3049 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3072 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpAnd3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3255 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3308 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3331 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3535 = new BitSet(new long[]{0x00000000F0004002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression3571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3596 = new BitSet(new long[]{0x00000000F0004002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3657 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3680 = new BitSet(new long[]{0x00000000F0004002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpCompare3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3923 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3976 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3999 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4203 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4256 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4279 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4483 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4536 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4559 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4812 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5082 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression5117 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5140 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5235 = new BitSet(new long[]{0x00000C0000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall5284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5307 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5323 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5345 = new BitSet(new long[]{0x00000C0000010002L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall5431 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall5455 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall5492 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall5521 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5542 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall5555 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5576 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall5590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5615 = new BitSet(new long[]{0x0000AC0000010002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall5649 = new BitSet(new long[]{0x9C55E10C80000070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5734 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5762 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall5775 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5796 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall5813 = new BitSet(new long[]{0x00008C0000010002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5846 = new BitSet(new long[]{0x00000C0000010002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXClosure6585 = new BitSet(new long[]{0xFC57A10C80000070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6656 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure6669 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6690 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure6712 = new BitSet(new long[]{0xFC56A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6749 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6863 = new BitSet(new long[]{0xFC54A10C80008072L,0x00000000000001FEL});
    public static final BitSet FOLLOW_15_in_ruleXExpressionInClosure6876 = new BitSet(new long[]{0xFC54A10C80000072L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7034 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXShortClosure7047 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7068 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure7090 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression7209 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7231 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression7334 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression7346 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7367 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression7379 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7400 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression7421 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression7537 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7578 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression7590 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7614 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7626 = new BitSet(new long[]{0x0220200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7647 = new BitSet(new long[]{0x03A0200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7661 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression7673 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7694 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7800 = new BitSet(new long[]{0x0220000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart7814 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7835 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart7849 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression7962 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression7974 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7995 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression8007 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8028 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression8040 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXWhileExpression8153 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression8165 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8186 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression8198 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression8311 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8332 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression8344 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression8356 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8377 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression8481 = new BitSet(new long[]{0xFD54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8503 = new BitSet(new long[]{0xFD54A10C80008070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression8516 = new BitSet(new long[]{0xFD54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration8750 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration8781 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8850 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8879 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleXVariableDeclaration8893 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter9066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter9076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter9122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9246 = new BitSet(new long[]{0x8000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall9260 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9281 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall9294 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9315 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_14_in_ruleXFeatureCall9329 = new BitSet(new long[]{0x8000000080000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9354 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall9388 = new BitSet(new long[]{0x9C55E10C80000070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9473 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9501 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall9514 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9535 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall9552 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleIdOrSuper9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStaticQualifier9822 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXConstructorCall9919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9942 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall9955 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9976 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall9989 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10010 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_14_in_ruleXConstructorCall10024 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall10038 = new BitSet(new long[]{0x9C55E10C80000070L,0x00000000000009FEL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10110 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10138 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall10151 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10172 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall10189 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXNullLiteral10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral10490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTypeLiteral10740 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral10752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10775 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral10787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXThrowExpression10879 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXReturnExpression10992 = new BitSet(new long[]{0x9C54A10C80000072L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression11116 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression11189 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression11233 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXCatchClause11347 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause11360 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11381 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause11393 = new BitSet(new long[]{0x9C54A10C80000070L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11509 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName11537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11560 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11665 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference11703 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference11715 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef11830 = new BitSet(new long[]{0x0000600000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11852 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef11865 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11886 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef11902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleXFunctionTypeRef11916 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12031 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference12052 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12074 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleJvmParameterizedTypeReference12087 = new BitSet(new long[]{0x0000200000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12108 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_14_in_ruleJvmParameterizedTypeReference12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference12335 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound12469 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded12573 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmLowerBound12677 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFlow2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFlow2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFlow3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFlow3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalFlow3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFlow3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFlow3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalFlow4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalFlow4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred10_InternalFlow5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred11_InternalFlow5252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalFlow5261 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFlow5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred12_InternalFlow5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalFlow5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred12_InternalFlow5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred13_InternalFlow5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFlow5683 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalFlow5690 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFlow5697 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalFlow5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalFlow5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFlow6602 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred16_InternalFlow6609 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFlow6616 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalFlow6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalFlow7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalFlow7553 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred19_InternalFlow7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalFlow8799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalFlow8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred21_InternalFlow9370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFlow9422 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred22_InternalFlow9429 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFlow9436 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred22_InternalFlow9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalFlow9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFlow10059 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44_in_synpred24_InternalFlow10066 = new BitSet(new long[]{0x0000200000000010L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFlow10073 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_48_in_synpred24_InternalFlow10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalFlow10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalFlow11006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred27_InternalFlow11151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred28_InternalFlow11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred30_InternalFlow11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalFlow11680 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred31_InternalFlow11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred32_InternalFlow12044 = new BitSet(new long[]{0x0000000000000002L});

}