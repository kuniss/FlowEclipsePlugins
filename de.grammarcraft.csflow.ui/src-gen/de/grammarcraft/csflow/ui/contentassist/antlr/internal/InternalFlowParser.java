package de.grammarcraft.csflow.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.grammarcraft.csflow.services.FlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Action'", "'Func'", "'package'", "'.'", "'import'", "'flow'", "'>'", "';'", "'in'", "'out'", "'ebc'", "'='", "'method'", "'#'", "'as'", "'<'", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFlowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFlowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFlowParser.tokenNames; }
    public String getGrammarFileName() { return "../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g"; }


     
     	private FlowGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:61:1: ( ruleModel EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:76:1: ( rule__Model__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:89:1: ( ruleQualifiedName EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFunctionUnit"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:116:1: entryRuleFunctionUnit : ruleFunctionUnit EOF ;
    public final void entryRuleFunctionUnit() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:117:1: ( ruleFunctionUnit EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:118:1: ruleFunctionUnit EOF
            {
             before(grammarAccess.getFunctionUnitRule()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit181);
            ruleFunctionUnit();

            state._fsp--;

             after(grammarAccess.getFunctionUnitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionUnit188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionUnit"


    // $ANTLR start "ruleFunctionUnit"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:125:1: ruleFunctionUnit : ( ( rule__FunctionUnit__Alternatives ) ) ;
    public final void ruleFunctionUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:129:2: ( ( ( rule__FunctionUnit__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:130:1: ( ( rule__FunctionUnit__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:130:1: ( ( rule__FunctionUnit__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:131:1: ( rule__FunctionUnit__Alternatives )
            {
             before(grammarAccess.getFunctionUnitAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:132:1: ( rule__FunctionUnit__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:132:2: rule__FunctionUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionUnit__Alternatives_in_ruleFunctionUnit214);
            rule__FunctionUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionUnit"


    // $ANTLR start "entryRuleImport"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:145:1: ( ruleImport EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:160:1: ( rule__Import__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFlow"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:172:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:173:1: ( ruleFlow EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:174:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow301);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:181:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:185:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:186:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:186:1: ( ( rule__Flow__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:187:1: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:188:1: ( rule__Flow__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:188:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow334);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleStream"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:200:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:201:1: ( ruleStream EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:202:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_ruleStream_in_entryRuleStream361);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStream368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:209:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:213:2: ( ( ( rule__Stream__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:214:1: ( ( rule__Stream__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:214:1: ( ( rule__Stream__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:215:1: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:216:1: ( rule__Stream__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:216:2: rule__Stream__Group__0
            {
            pushFollow(FOLLOW_rule__Stream__Group__0_in_ruleStream394);
            rule__Stream__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleLeftPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:228:1: entryRuleLeftPort : ruleLeftPort EOF ;
    public final void entryRuleLeftPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:229:1: ( ruleLeftPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:230:1: ruleLeftPort EOF
            {
             before(grammarAccess.getLeftPortRule()); 
            pushFollow(FOLLOW_ruleLeftPort_in_entryRuleLeftPort421);
            ruleLeftPort();

            state._fsp--;

             after(grammarAccess.getLeftPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftPort428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftPort"


    // $ANTLR start "ruleLeftPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:237:1: ruleLeftPort : ( ( rule__LeftPort__Alternatives ) ) ;
    public final void ruleLeftPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:241:2: ( ( ( rule__LeftPort__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:242:1: ( ( rule__LeftPort__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:242:1: ( ( rule__LeftPort__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:243:1: ( rule__LeftPort__Alternatives )
            {
             before(grammarAccess.getLeftPortAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:244:1: ( rule__LeftPort__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:244:2: rule__LeftPort__Alternatives
            {
            pushFollow(FOLLOW_rule__LeftPort__Alternatives_in_ruleLeftPort454);
            rule__LeftPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLeftPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftPort"


    // $ANTLR start "entryRuleGlobalInputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:256:1: entryRuleGlobalInputPort : ruleGlobalInputPort EOF ;
    public final void entryRuleGlobalInputPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:257:1: ( ruleGlobalInputPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:258:1: ruleGlobalInputPort EOF
            {
             before(grammarAccess.getGlobalInputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort481);
            ruleGlobalInputPort();

            state._fsp--;

             after(grammarAccess.getGlobalInputPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInputPort488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalInputPort"


    // $ANTLR start "ruleGlobalInputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:265:1: ruleGlobalInputPort : ( ( rule__GlobalInputPort__Group__0 ) ) ;
    public final void ruleGlobalInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:269:2: ( ( ( rule__GlobalInputPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:270:1: ( ( rule__GlobalInputPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:270:1: ( ( rule__GlobalInputPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:271:1: ( rule__GlobalInputPort__Group__0 )
            {
             before(grammarAccess.getGlobalInputPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:272:1: ( rule__GlobalInputPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:272:2: rule__GlobalInputPort__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__0_in_ruleGlobalInputPort514);
            rule__GlobalInputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalInputPort"


    // $ANTLR start "entryRuleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:284:1: entryRuleUnnamedSubFlowPort : ruleUnnamedSubFlowPort EOF ;
    public final void entryRuleUnnamedSubFlowPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:285:1: ( ruleUnnamedSubFlowPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:286:1: ruleUnnamedSubFlowPort EOF
            {
             before(grammarAccess.getUnnamedSubFlowPortRule()); 
            pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort541);
            ruleUnnamedSubFlowPort();

            state._fsp--;

             after(grammarAccess.getUnnamedSubFlowPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnnamedSubFlowPort"


    // $ANTLR start "ruleUnnamedSubFlowPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:293:1: ruleUnnamedSubFlowPort : ( ( rule__UnnamedSubFlowPort__Group__0 ) ) ;
    public final void ruleUnnamedSubFlowPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:297:2: ( ( ( rule__UnnamedSubFlowPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:298:1: ( ( rule__UnnamedSubFlowPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:298:1: ( ( rule__UnnamedSubFlowPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:299:1: ( rule__UnnamedSubFlowPort__Group__0 )
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:300:1: ( rule__UnnamedSubFlowPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:300:2: rule__UnnamedSubFlowPort__Group__0
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__0_in_ruleUnnamedSubFlowPort574);
            rule__UnnamedSubFlowPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnnamedSubFlowPort"


    // $ANTLR start "entryRuleRightPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:312:1: entryRuleRightPort : ruleRightPort EOF ;
    public final void entryRuleRightPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:313:1: ( ruleRightPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:314:1: ruleRightPort EOF
            {
             before(grammarAccess.getRightPortRule()); 
            pushFollow(FOLLOW_ruleRightPort_in_entryRuleRightPort601);
            ruleRightPort();

            state._fsp--;

             after(grammarAccess.getRightPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightPort608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightPort"


    // $ANTLR start "ruleRightPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:321:1: ruleRightPort : ( ( rule__RightPort__Alternatives ) ) ;
    public final void ruleRightPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:325:2: ( ( ( rule__RightPort__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ( ( rule__RightPort__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:326:1: ( ( rule__RightPort__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:327:1: ( rule__RightPort__Alternatives )
            {
             before(grammarAccess.getRightPortAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:328:1: ( rule__RightPort__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:328:2: rule__RightPort__Alternatives
            {
            pushFollow(FOLLOW_rule__RightPort__Alternatives_in_ruleRightPort634);
            rule__RightPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRightPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightPort"


    // $ANTLR start "entryRuleGlobalOutputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:340:1: entryRuleGlobalOutputPort : ruleGlobalOutputPort EOF ;
    public final void entryRuleGlobalOutputPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:341:1: ( ruleGlobalOutputPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:342:1: ruleGlobalOutputPort EOF
            {
             before(grammarAccess.getGlobalOutputPortRule()); 
            pushFollow(FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort661);
            ruleGlobalOutputPort();

            state._fsp--;

             after(grammarAccess.getGlobalOutputPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalOutputPort668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalOutputPort"


    // $ANTLR start "ruleGlobalOutputPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:349:1: ruleGlobalOutputPort : ( ( rule__GlobalOutputPort__Group__0 ) ) ;
    public final void ruleGlobalOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:353:2: ( ( ( rule__GlobalOutputPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ( ( rule__GlobalOutputPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:354:1: ( ( rule__GlobalOutputPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:355:1: ( rule__GlobalOutputPort__Group__0 )
            {
             before(grammarAccess.getGlobalOutputPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:356:1: ( rule__GlobalOutputPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:356:2: rule__GlobalOutputPort__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__0_in_ruleGlobalOutputPort694);
            rule__GlobalOutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalOutputPort"


    // $ANTLR start "entryRulePort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:368:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:369:1: ( rulePort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:370:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort721);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:377:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:381:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ( ( rule__Port__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:382:1: ( ( rule__Port__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:383:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:384:1: ( rule__Port__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:384:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort754);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleNamedPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:396:1: entryRuleNamedPort : ruleNamedPort EOF ;
    public final void entryRuleNamedPort() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:397:1: ( ruleNamedPort EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:398:1: ruleNamedPort EOF
            {
             before(grammarAccess.getNamedPortRule()); 
            pushFollow(FOLLOW_ruleNamedPort_in_entryRuleNamedPort781);
            ruleNamedPort();

            state._fsp--;

             after(grammarAccess.getNamedPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPort788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedPort"


    // $ANTLR start "ruleNamedPort"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:405:1: ruleNamedPort : ( ( rule__NamedPort__Group__0 ) ) ;
    public final void ruleNamedPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:409:2: ( ( ( rule__NamedPort__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ( ( rule__NamedPort__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:410:1: ( ( rule__NamedPort__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:411:1: ( rule__NamedPort__Group__0 )
            {
             before(grammarAccess.getNamedPortAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:412:1: ( rule__NamedPort__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:412:2: rule__NamedPort__Group__0
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__0_in_ruleNamedPort814);
            rule__NamedPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedPort"


    // $ANTLR start "entryRuleOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:424:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:425:1: ( ruleOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:426:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation841);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:433:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:437:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:438:1: ( ( rule__Operation__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:439:1: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:440:1: ( rule__Operation__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:440:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation874);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEbcOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:452:1: entryRuleEbcOperation : ruleEbcOperation EOF ;
    public final void entryRuleEbcOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:453:1: ( ruleEbcOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:454:1: ruleEbcOperation EOF
            {
             before(grammarAccess.getEbcOperationRule()); 
            pushFollow(FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation901);
            ruleEbcOperation();

            state._fsp--;

             after(grammarAccess.getEbcOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEbcOperation908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEbcOperation"


    // $ANTLR start "ruleEbcOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:461:1: ruleEbcOperation : ( ( rule__EbcOperation__Group__0 ) ) ;
    public final void ruleEbcOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:465:2: ( ( ( rule__EbcOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ( ( rule__EbcOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:466:1: ( ( rule__EbcOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:467:1: ( rule__EbcOperation__Group__0 )
            {
             before(grammarAccess.getEbcOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:468:1: ( rule__EbcOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:468:2: rule__EbcOperation__Group__0
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__0_in_ruleEbcOperation934);
            rule__EbcOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEbcOperation"


    // $ANTLR start "entryRuleNativeClass"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:480:1: entryRuleNativeClass : ruleNativeClass EOF ;
    public final void entryRuleNativeClass() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:481:1: ( ruleNativeClass EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:482:1: ruleNativeClass EOF
            {
             before(grammarAccess.getNativeClassRule()); 
            pushFollow(FOLLOW_ruleNativeClass_in_entryRuleNativeClass961);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getNativeClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeClass968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeClass"


    // $ANTLR start "ruleNativeClass"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:489:1: ruleNativeClass : ( ( rule__NativeClass__ReferenceAssignment ) ) ;
    public final void ruleNativeClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:493:2: ( ( ( rule__NativeClass__ReferenceAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ( ( rule__NativeClass__ReferenceAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:494:1: ( ( rule__NativeClass__ReferenceAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:495:1: ( rule__NativeClass__ReferenceAssignment )
            {
             before(grammarAccess.getNativeClassAccess().getReferenceAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:496:1: ( rule__NativeClass__ReferenceAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:496:2: rule__NativeClass__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__NativeClass__ReferenceAssignment_in_ruleNativeClass994);
            rule__NativeClass__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeClassAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeClass"


    // $ANTLR start "entryRuleMethodOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:508:1: entryRuleMethodOperation : ruleMethodOperation EOF ;
    public final void entryRuleMethodOperation() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:509:1: ( ruleMethodOperation EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:510:1: ruleMethodOperation EOF
            {
             before(grammarAccess.getMethodOperationRule()); 
            pushFollow(FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1021);
            ruleMethodOperation();

            state._fsp--;

             after(grammarAccess.getMethodOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodOperation1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodOperation"


    // $ANTLR start "ruleMethodOperation"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:517:1: ruleMethodOperation : ( ( rule__MethodOperation__Group__0 ) ) ;
    public final void ruleMethodOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:521:2: ( ( ( rule__MethodOperation__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ( ( rule__MethodOperation__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:522:1: ( ( rule__MethodOperation__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:523:1: ( rule__MethodOperation__Group__0 )
            {
             before(grammarAccess.getMethodOperationAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:524:1: ( rule__MethodOperation__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:524:2: rule__MethodOperation__Group__0
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__0_in_ruleMethodOperation1054);
            rule__MethodOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodOperation"


    // $ANTLR start "entryRuleSignature"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:536:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:537:1: ( ruleSignature EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:538:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_ruleSignature_in_entryRuleSignature1081);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignature1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:545:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:549:2: ( ( ( rule__Signature__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ( ( rule__Signature__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:550:1: ( ( rule__Signature__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:551:1: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:552:1: ( rule__Signature__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:552:2: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_rule__Signature__Group__0_in_ruleSignature1114);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleGenericType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:564:1: entryRuleGenericType : ruleGenericType EOF ;
    public final void entryRuleGenericType() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:565:1: ( ruleGenericType EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:566:1: ruleGenericType EOF
            {
             before(grammarAccess.getGenericTypeRule()); 
            pushFollow(FOLLOW_ruleGenericType_in_entryRuleGenericType1141);
            ruleGenericType();

            state._fsp--;

             after(grammarAccess.getGenericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericType1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericType"


    // $ANTLR start "ruleGenericType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:573:1: ruleGenericType : ( ( rule__GenericType__Group__0 ) ) ;
    public final void ruleGenericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:577:2: ( ( ( rule__GenericType__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:578:1: ( ( rule__GenericType__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:578:1: ( ( rule__GenericType__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:579:1: ( rule__GenericType__Group__0 )
            {
             before(grammarAccess.getGenericTypeAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:580:1: ( rule__GenericType__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:580:2: rule__GenericType__Group__0
            {
            pushFollow(FOLLOW_rule__GenericType__Group__0_in_ruleGenericType1174);
            rule__GenericType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericType"


    // $ANTLR start "entryRuleOperationType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:592:1: entryRuleOperationType : ruleOperationType EOF ;
    public final void entryRuleOperationType() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:593:1: ( ruleOperationType EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:594:1: ruleOperationType EOF
            {
             before(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_ruleOperationType_in_entryRuleOperationType1201);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getOperationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationType1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:601:1: ruleOperationType : ( ( rule__OperationType__NameAssignment ) ) ;
    public final void ruleOperationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:605:2: ( ( ( rule__OperationType__NameAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:606:1: ( ( rule__OperationType__NameAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:606:1: ( ( rule__OperationType__NameAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:607:1: ( rule__OperationType__NameAssignment )
            {
             before(grammarAccess.getOperationTypeAccess().getNameAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:608:1: ( rule__OperationType__NameAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:608:2: rule__OperationType__NameAssignment
            {
            pushFollow(FOLLOW_rule__OperationType__NameAssignment_in_ruleOperationType1234);
            rule__OperationType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleOperationTypeParameters"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:620:1: entryRuleOperationTypeParameters : ruleOperationTypeParameters EOF ;
    public final void entryRuleOperationTypeParameters() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:621:1: ( ruleOperationTypeParameters EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:622:1: ruleOperationTypeParameters EOF
            {
             before(grammarAccess.getOperationTypeParametersRule()); 
            pushFollow(FOLLOW_ruleOperationTypeParameters_in_entryRuleOperationTypeParameters1261);
            ruleOperationTypeParameters();

            state._fsp--;

             after(grammarAccess.getOperationTypeParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationTypeParameters1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationTypeParameters"


    // $ANTLR start "ruleOperationTypeParameters"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:629:1: ruleOperationTypeParameters : ( ( rule__OperationTypeParameters__Group__0 ) ) ;
    public final void ruleOperationTypeParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:633:2: ( ( ( rule__OperationTypeParameters__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:634:1: ( ( rule__OperationTypeParameters__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:634:1: ( ( rule__OperationTypeParameters__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:635:1: ( rule__OperationTypeParameters__Group__0 )
            {
             before(grammarAccess.getOperationTypeParametersAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:636:1: ( rule__OperationTypeParameters__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:636:2: rule__OperationTypeParameters__Group__0
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__0_in_ruleOperationTypeParameters1294);
            rule__OperationTypeParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationTypeParameters"


    // $ANTLR start "entryRuleTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:648:1: entryRuleTypeParameter : ruleTypeParameter EOF ;
    public final void entryRuleTypeParameter() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:649:1: ( ruleTypeParameter EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:650:1: ruleTypeParameter EOF
            {
             before(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1321);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:657:1: ruleTypeParameter : ( ( rule__TypeParameter__Alternatives ) ) ;
    public final void ruleTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:661:2: ( ( ( rule__TypeParameter__Alternatives ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:662:1: ( ( rule__TypeParameter__Alternatives ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:662:1: ( ( rule__TypeParameter__Alternatives ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:663:1: ( rule__TypeParameter__Alternatives )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:664:1: ( rule__TypeParameter__Alternatives )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:664:2: rule__TypeParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter1354);
            rule__TypeParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleCSTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:676:1: entryRuleCSTypeParameter : ruleCSTypeParameter EOF ;
    public final void entryRuleCSTypeParameter() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:677:1: ( ruleCSTypeParameter EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:678:1: ruleCSTypeParameter EOF
            {
             before(grammarAccess.getCSTypeParameterRule()); 
            pushFollow(FOLLOW_ruleCSTypeParameter_in_entryRuleCSTypeParameter1381);
            ruleCSTypeParameter();

            state._fsp--;

             after(grammarAccess.getCSTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSTypeParameter1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSTypeParameter"


    // $ANTLR start "ruleCSTypeParameter"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:685:1: ruleCSTypeParameter : ( ( rule__CSTypeParameter__Group__0 ) ) ;
    public final void ruleCSTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:689:2: ( ( ( rule__CSTypeParameter__Group__0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:690:1: ( ( rule__CSTypeParameter__Group__0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:690:1: ( ( rule__CSTypeParameter__Group__0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:691:1: ( rule__CSTypeParameter__Group__0 )
            {
             before(grammarAccess.getCSTypeParameterAccess().getGroup()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:692:1: ( rule__CSTypeParameter__Group__0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:692:2: rule__CSTypeParameter__Group__0
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__Group__0_in_ruleCSTypeParameter1414);
            rule__CSTypeParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSTypeParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSTypeParameter"


    // $ANTLR start "entryRuleType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:704:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:705:1: ( ruleType EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:706:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1441);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:713:1: ruleType : ( ( rule__Type__ReferenceAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:717:2: ( ( ( rule__Type__ReferenceAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:718:1: ( ( rule__Type__ReferenceAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:718:1: ( ( rule__Type__ReferenceAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:719:1: ( rule__Type__ReferenceAssignment )
            {
             before(grammarAccess.getTypeAccess().getReferenceAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:720:1: ( rule__Type__ReferenceAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:720:2: rule__Type__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__Type__ReferenceAssignment_in_ruleType1474);
            rule__Type__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNativeMethod"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:732:1: entryRuleNativeMethod : ruleNativeMethod EOF ;
    public final void entryRuleNativeMethod() throws RecognitionException {
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:733:1: ( ruleNativeMethod EOF )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:734:1: ruleNativeMethod EOF
            {
             before(grammarAccess.getNativeMethodRule()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod1501);
            ruleNativeMethod();

            state._fsp--;

             after(grammarAccess.getNativeMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeMethod1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNativeMethod"


    // $ANTLR start "ruleNativeMethod"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:741:1: ruleNativeMethod : ( ( rule__NativeMethod__NameAssignment ) ) ;
    public final void ruleNativeMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:745:2: ( ( ( rule__NativeMethod__NameAssignment ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:746:1: ( ( rule__NativeMethod__NameAssignment ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:746:1: ( ( rule__NativeMethod__NameAssignment ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:747:1: ( rule__NativeMethod__NameAssignment )
            {
             before(grammarAccess.getNativeMethodAccess().getNameAssignment()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:748:1: ( rule__NativeMethod__NameAssignment )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:748:2: rule__NativeMethod__NameAssignment
            {
            pushFollow(FOLLOW_rule__NativeMethod__NameAssignment_in_ruleNativeMethod1534);
            rule__NativeMethod__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeMethodAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeMethod"


    // $ANTLR start "rule__FunctionUnit__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:760:1: rule__FunctionUnit__Alternatives : ( ( ruleFlow ) | ( ruleOperation ) );
    public final void rule__FunctionUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:764:1: ( ( ruleFlow ) | ( ruleOperation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==21||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:765:1: ( ruleFlow )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:765:1: ( ruleFlow )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:766:1: ruleFlow
                    {
                     before(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFlow_in_rule__FunctionUnit__Alternatives1570);
                    ruleFlow();

                    state._fsp--;

                     after(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:771:6: ( ruleOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:771:6: ( ruleOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:772:1: ruleOperation
                    {
                     before(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOperation_in_rule__FunctionUnit__Alternatives1587);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionUnit__Alternatives"


    // $ANTLR start "rule__LeftPort__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:782:1: rule__LeftPort__Alternatives : ( ( ruleGlobalInputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) );
    public final void rule__LeftPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:786:1: ( ( ruleGlobalInputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==17) ) {
                    alt2=2;
                }
                else if ( (LA2_1==19) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:787:1: ( ruleGlobalInputPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:787:1: ( ruleGlobalInputPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:788:1: ruleGlobalInputPort
                    {
                     before(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGlobalInputPort_in_rule__LeftPort__Alternatives1619);
                    ruleGlobalInputPort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:793:6: ( ruleUnnamedSubFlowPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:793:6: ( ruleUnnamedSubFlowPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:794:1: ruleUnnamedSubFlowPort
                    {
                     before(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_rule__LeftPort__Alternatives1636);
                    ruleUnnamedSubFlowPort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:799:6: ( rulePort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:799:6: ( rulePort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:800:1: rulePort
                    {
                     before(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePort_in_rule__LeftPort__Alternatives1653);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftPort__Alternatives"


    // $ANTLR start "rule__RightPort__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:810:1: rule__RightPort__Alternatives : ( ( ruleGlobalOutputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) );
    public final void rule__RightPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:814:1: ( ( ruleGlobalOutputPort ) | ( ruleUnnamedSubFlowPort ) | ( rulePort ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==18) ) {
                    alt3=2;
                }
                else if ( (LA3_1==20) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:815:1: ( ruleGlobalOutputPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:815:1: ( ruleGlobalOutputPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:816:1: ruleGlobalOutputPort
                    {
                     before(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGlobalOutputPort_in_rule__RightPort__Alternatives1685);
                    ruleGlobalOutputPort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:821:6: ( ruleUnnamedSubFlowPort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:821:6: ( ruleUnnamedSubFlowPort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:822:1: ruleUnnamedSubFlowPort
                    {
                     before(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnnamedSubFlowPort_in_rule__RightPort__Alternatives1702);
                    ruleUnnamedSubFlowPort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:827:6: ( rulePort )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:827:6: ( rulePort )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:828:1: rulePort
                    {
                     before(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePort_in_rule__RightPort__Alternatives1719);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightPort__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:838:1: rule__Operation__Alternatives : ( ( ruleEbcOperation ) | ( ruleMethodOperation ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:842:1: ( ( ruleEbcOperation ) | ( ruleMethodOperation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:843:1: ( ruleEbcOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:843:1: ( ruleEbcOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:844:1: ruleEbcOperation
                    {
                     before(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEbcOperation_in_rule__Operation__Alternatives1751);
                    ruleEbcOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:849:6: ( ruleMethodOperation )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:849:6: ( ruleMethodOperation )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:850:1: ruleMethodOperation
                    {
                     before(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMethodOperation_in_rule__Operation__Alternatives1768);
                    ruleMethodOperation();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__OperationType__NameAlternatives_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:860:1: rule__OperationType__NameAlternatives_0 : ( ( 'Action' ) | ( 'Func' ) );
    public final void rule__OperationType__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:864:1: ( ( 'Action' ) | ( 'Func' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:865:1: ( 'Action' )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:865:1: ( 'Action' )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:866:1: 'Action'
                    {
                     before(grammarAccess.getOperationTypeAccess().getNameActionKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__OperationType__NameAlternatives_01801); 
                     after(grammarAccess.getOperationTypeAccess().getNameActionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:873:6: ( 'Func' )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:873:6: ( 'Func' )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:874:1: 'Func'
                    {
                     before(grammarAccess.getOperationTypeAccess().getNameFuncKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__OperationType__NameAlternatives_01821); 
                     after(grammarAccess.getOperationTypeAccess().getNameFuncKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__NameAlternatives_0"


    // $ANTLR start "rule__TypeParameter__Alternatives"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:886:1: rule__TypeParameter__Alternatives : ( ( ruleGenericType ) | ( ruleType ) );
    public final void rule__TypeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:890:1: ( ( ruleGenericType ) | ( ruleType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:891:1: ( ruleGenericType )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:891:1: ( ruleGenericType )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:892:1: ruleGenericType
                    {
                     before(grammarAccess.getTypeParameterAccess().getGenericTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGenericType_in_rule__TypeParameter__Alternatives1855);
                    ruleGenericType();

                    state._fsp--;

                     after(grammarAccess.getTypeParameterAccess().getGenericTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:897:6: ( ruleType )
                    {
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:897:6: ( ruleType )
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:898:1: ruleType
                    {
                     before(grammarAccess.getTypeParameterAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__TypeParameter__Alternatives1872);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getTypeParameterAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeParameter__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:910:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:914:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:915:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01902);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01905);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:922:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:926:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:927:1: ( ( rule__Model__Group_0__0 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:927:1: ( ( rule__Model__Group_0__0 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:928:1: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:929:1: ( rule__Model__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:929:2: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl1932);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:939:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:943:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:944:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11963);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11966);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:951:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:955:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:956:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:956:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:957:1: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:958:1: ( rule__Model__ImportsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:958:2: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl1993);
            	    rule__Model__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:968:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:972:1: ( rule__Model__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:973:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22024);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:979:1: rule__Model__Group__2__Impl : ( ( rule__Model__FunctionUnitsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:983:1: ( ( ( rule__Model__FunctionUnitsAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:984:1: ( ( rule__Model__FunctionUnitsAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:984:1: ( ( rule__Model__FunctionUnitsAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:985:1: ( rule__Model__FunctionUnitsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:986:1: ( rule__Model__FunctionUnitsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||LA9_0==21||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:986:2: rule__Model__FunctionUnitsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionUnitsAssignment_2_in_rule__Model__Group__2__Impl2051);
            	    rule__Model__FunctionUnitsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1002:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1006:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1007:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__02088);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__02091);
            rule__Model__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1014:1: rule__Model__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1018:1: ( ( 'package' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1019:1: ( 'package' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1019:1: ( 'package' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1020:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group_0__0__Impl2119); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1033:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1037:1: ( rule__Model__Group_0__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1038:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__12150);
            rule__Model__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1044:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1048:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1049:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1049:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1050:1: ( rule__Model__NameAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1051:1: ( rule__Model__NameAssignment_0_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1051:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl2177);
            rule__Model__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1065:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1069:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1070:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02211);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02214);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1077:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1081:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1082:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1082:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1083:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2241); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1094:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1098:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1099:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12270);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1105:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1109:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1110:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1110:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1111:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1112:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1112:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2297);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1126:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1130:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1131:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02332);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02335);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1138:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1142:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1143:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1143:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1144:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl2363); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1157:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1161:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1162:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12394);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1168:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1172:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1173:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1173:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1174:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2421); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1189:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1193:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1194:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02454);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02457);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1201:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1205:1: ( ( 'import' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1206:1: ( 'import' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1206:1: ( 'import' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1207:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl2485); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1220:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1224:1: ( rule__Import__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1225:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12516);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1231:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1235:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1236:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1236:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1237:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1238:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1238:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2543);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1252:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1256:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1257:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02577);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02580);
            rule__Flow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1264:1: rule__Flow__Group__0__Impl : ( 'flow' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1268:1: ( ( 'flow' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1269:1: ( 'flow' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1269:1: ( 'flow' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1270:1: 'flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Flow__Group__0__Impl2608); 
             after(grammarAccess.getFlowAccess().getFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1283:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1287:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1288:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12639);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12642);
            rule__Flow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1295:1: rule__Flow__Group__1__Impl : ( ( rule__Flow__NameAssignment_1 ) ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1299:1: ( ( ( rule__Flow__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1300:1: ( ( rule__Flow__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1300:1: ( ( rule__Flow__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1301:1: ( rule__Flow__NameAssignment_1 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1302:1: ( rule__Flow__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1302:2: rule__Flow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl2669);
            rule__Flow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1312:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1316:1: ( rule__Flow__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1317:2: rule__Flow__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22699);
            rule__Flow__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1323:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__StreamsAssignment_2 )* ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1327:1: ( ( ( rule__Flow__StreamsAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1328:1: ( ( rule__Flow__StreamsAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1328:1: ( ( rule__Flow__StreamsAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1329:1: ( rule__Flow__StreamsAssignment_2 )*
            {
             before(grammarAccess.getFlowAccess().getStreamsAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1330:1: ( rule__Flow__StreamsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1330:2: rule__Flow__StreamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Flow__StreamsAssignment_2_in_rule__Flow__Group__2__Impl2726);
            	    rule__Flow__StreamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getStreamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1346:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1350:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1351:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_rule__Stream__Group__0__Impl_in_rule__Stream__Group__02763);
            rule__Stream__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__1_in_rule__Stream__Group__02766);
            rule__Stream__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0"


    // $ANTLR start "rule__Stream__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1358:1: rule__Stream__Group__0__Impl : ( ( rule__Stream__LeftPortAssignment_0 ) ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1362:1: ( ( ( rule__Stream__LeftPortAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1363:1: ( ( rule__Stream__LeftPortAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1363:1: ( ( rule__Stream__LeftPortAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1364:1: ( rule__Stream__LeftPortAssignment_0 )
            {
             before(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1365:1: ( rule__Stream__LeftPortAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1365:2: rule__Stream__LeftPortAssignment_0
            {
            pushFollow(FOLLOW_rule__Stream__LeftPortAssignment_0_in_rule__Stream__Group__0__Impl2793);
            rule__Stream__LeftPortAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1375:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1379:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1380:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_rule__Stream__Group__1__Impl_in_rule__Stream__Group__12823);
            rule__Stream__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__2_in_rule__Stream__Group__12826);
            rule__Stream__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1"


    // $ANTLR start "rule__Stream__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1387:1: rule__Stream__Group__1__Impl : ( '>' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1391:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1392:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1392:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1393:1: '>'
            {
             before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Stream__Group__1__Impl2854); 
             after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__1__Impl"


    // $ANTLR start "rule__Stream__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1406:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1410:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1411:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_rule__Stream__Group__2__Impl_in_rule__Stream__Group__22885);
            rule__Stream__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__3_in_rule__Stream__Group__22888);
            rule__Stream__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2"


    // $ANTLR start "rule__Stream__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1418:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__MessageAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1422:1: ( ( ( rule__Stream__MessageAssignment_2 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1423:1: ( ( rule__Stream__MessageAssignment_2 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1423:1: ( ( rule__Stream__MessageAssignment_2 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1424:1: ( rule__Stream__MessageAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getMessageAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1425:1: ( rule__Stream__MessageAssignment_2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1425:2: rule__Stream__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__Stream__MessageAssignment_2_in_rule__Stream__Group__2__Impl2915);
            rule__Stream__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1435:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1439:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1440:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
            {
            pushFollow(FOLLOW_rule__Stream__Group__3__Impl_in_rule__Stream__Group__32945);
            rule__Stream__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__4_in_rule__Stream__Group__32948);
            rule__Stream__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3"


    // $ANTLR start "rule__Stream__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1447:1: rule__Stream__Group__3__Impl : ( '>' ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1451:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1452:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1452:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1453:1: '>'
            {
             before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Stream__Group__3__Impl2976); 
             after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group__4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1466:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl rule__Stream__Group__5 ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1470:1: ( rule__Stream__Group__4__Impl rule__Stream__Group__5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1471:2: rule__Stream__Group__4__Impl rule__Stream__Group__5
            {
            pushFollow(FOLLOW_rule__Stream__Group__4__Impl_in_rule__Stream__Group__43007);
            rule__Stream__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stream__Group__5_in_rule__Stream__Group__43010);
            rule__Stream__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__4"


    // $ANTLR start "rule__Stream__Group__4__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1478:1: rule__Stream__Group__4__Impl : ( ( rule__Stream__RightPortAssignment_4 ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1482:1: ( ( ( rule__Stream__RightPortAssignment_4 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1483:1: ( ( rule__Stream__RightPortAssignment_4 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1483:1: ( ( rule__Stream__RightPortAssignment_4 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1484:1: ( rule__Stream__RightPortAssignment_4 )
            {
             before(grammarAccess.getStreamAccess().getRightPortAssignment_4()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1485:1: ( rule__Stream__RightPortAssignment_4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1485:2: rule__Stream__RightPortAssignment_4
            {
            pushFollow(FOLLOW_rule__Stream__RightPortAssignment_4_in_rule__Stream__Group__4__Impl3037);
            rule__Stream__RightPortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getRightPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__4__Impl"


    // $ANTLR start "rule__Stream__Group__5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1495:1: rule__Stream__Group__5 : rule__Stream__Group__5__Impl ;
    public final void rule__Stream__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1499:1: ( rule__Stream__Group__5__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1500:2: rule__Stream__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Stream__Group__5__Impl_in_rule__Stream__Group__53067);
            rule__Stream__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__5"


    // $ANTLR start "rule__Stream__Group__5__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1506:1: rule__Stream__Group__5__Impl : ( ';' ) ;
    public final void rule__Stream__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1510:1: ( ( ';' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1511:1: ( ';' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1511:1: ( ';' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1512:1: ';'
            {
             before(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Stream__Group__5__Impl3095); 
             after(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__5__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1537:1: rule__GlobalInputPort__Group__0 : rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1 ;
    public final void rule__GlobalInputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1541:1: ( rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1542:2: rule__GlobalInputPort__Group__0__Impl rule__GlobalInputPort__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__0__Impl_in_rule__GlobalInputPort__Group__03138);
            rule__GlobalInputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInputPort__Group__1_in_rule__GlobalInputPort__Group__03141);
            rule__GlobalInputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__0"


    // $ANTLR start "rule__GlobalInputPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1549:1: rule__GlobalInputPort__Group__0__Impl : ( '.' ) ;
    public final void rule__GlobalInputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1553:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1554:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1554:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1555:1: '.'
            {
             before(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__GlobalInputPort__Group__0__Impl3169); 
             after(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__0__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1568:1: rule__GlobalInputPort__Group__1 : rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2 ;
    public final void rule__GlobalInputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1572:1: ( rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1573:2: rule__GlobalInputPort__Group__1__Impl rule__GlobalInputPort__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__1__Impl_in_rule__GlobalInputPort__Group__13200);
            rule__GlobalInputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInputPort__Group__2_in_rule__GlobalInputPort__Group__13203);
            rule__GlobalInputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__1"


    // $ANTLR start "rule__GlobalInputPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1580:1: rule__GlobalInputPort__Group__1__Impl : ( 'in' ) ;
    public final void rule__GlobalInputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1584:1: ( ( 'in' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1585:1: ( 'in' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1585:1: ( 'in' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1586:1: 'in'
            {
             before(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__GlobalInputPort__Group__1__Impl3231); 
             after(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalInputPort__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1599:1: rule__GlobalInputPort__Group__2 : rule__GlobalInputPort__Group__2__Impl ;
    public final void rule__GlobalInputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1603:1: ( rule__GlobalInputPort__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1604:2: rule__GlobalInputPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalInputPort__Group__2__Impl_in_rule__GlobalInputPort__Group__23262);
            rule__GlobalInputPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__2"


    // $ANTLR start "rule__GlobalInputPort__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1610:1: rule__GlobalInputPort__Group__2__Impl : ( () ) ;
    public final void rule__GlobalInputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1614:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1615:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1615:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1616:1: ()
            {
             before(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1617:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1619:1: 
            {
            }

             after(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInputPort__Group__2__Impl"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1635:1: rule__UnnamedSubFlowPort__Group__0 : rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1 ;
    public final void rule__UnnamedSubFlowPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1639:1: ( rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1640:2: rule__UnnamedSubFlowPort__Group__0__Impl rule__UnnamedSubFlowPort__Group__1
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__0__Impl_in_rule__UnnamedSubFlowPort__Group__03326);
            rule__UnnamedSubFlowPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__1_in_rule__UnnamedSubFlowPort__Group__03329);
            rule__UnnamedSubFlowPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__0"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1647:1: rule__UnnamedSubFlowPort__Group__0__Impl : ( '.' ) ;
    public final void rule__UnnamedSubFlowPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1651:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1652:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1652:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1653:1: '.'
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__UnnamedSubFlowPort__Group__0__Impl3357); 
             after(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__0__Impl"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1666:1: rule__UnnamedSubFlowPort__Group__1 : rule__UnnamedSubFlowPort__Group__1__Impl ;
    public final void rule__UnnamedSubFlowPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1670:1: ( rule__UnnamedSubFlowPort__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1671:2: rule__UnnamedSubFlowPort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnnamedSubFlowPort__Group__1__Impl_in_rule__UnnamedSubFlowPort__Group__13388);
            rule__UnnamedSubFlowPort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__1"


    // $ANTLR start "rule__UnnamedSubFlowPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1677:1: rule__UnnamedSubFlowPort__Group__1__Impl : ( () ) ;
    public final void rule__UnnamedSubFlowPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1681:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1682:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1682:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1683:1: ()
            {
             before(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1684:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1686:1: 
            {
            }

             after(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedSubFlowPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1700:1: rule__GlobalOutputPort__Group__0 : rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1 ;
    public final void rule__GlobalOutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1704:1: ( rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1705:2: rule__GlobalOutputPort__Group__0__Impl rule__GlobalOutputPort__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__0__Impl_in_rule__GlobalOutputPort__Group__03450);
            rule__GlobalOutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__1_in_rule__GlobalOutputPort__Group__03453);
            rule__GlobalOutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__0"


    // $ANTLR start "rule__GlobalOutputPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1712:1: rule__GlobalOutputPort__Group__0__Impl : ( '.' ) ;
    public final void rule__GlobalOutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1716:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1717:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1717:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1718:1: '.'
            {
             before(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__GlobalOutputPort__Group__0__Impl3481); 
             after(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__0__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1731:1: rule__GlobalOutputPort__Group__1 : rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2 ;
    public final void rule__GlobalOutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1735:1: ( rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1736:2: rule__GlobalOutputPort__Group__1__Impl rule__GlobalOutputPort__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__1__Impl_in_rule__GlobalOutputPort__Group__13512);
            rule__GlobalOutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__2_in_rule__GlobalOutputPort__Group__13515);
            rule__GlobalOutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__1"


    // $ANTLR start "rule__GlobalOutputPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1743:1: rule__GlobalOutputPort__Group__1__Impl : ( 'out' ) ;
    public final void rule__GlobalOutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1747:1: ( ( 'out' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1748:1: ( 'out' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1748:1: ( 'out' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1749:1: 'out'
            {
             before(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__GlobalOutputPort__Group__1__Impl3543); 
             after(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__1__Impl"


    // $ANTLR start "rule__GlobalOutputPort__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1762:1: rule__GlobalOutputPort__Group__2 : rule__GlobalOutputPort__Group__2__Impl ;
    public final void rule__GlobalOutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1766:1: ( rule__GlobalOutputPort__Group__2__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1767:2: rule__GlobalOutputPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalOutputPort__Group__2__Impl_in_rule__GlobalOutputPort__Group__23574);
            rule__GlobalOutputPort__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__2"


    // $ANTLR start "rule__GlobalOutputPort__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1773:1: rule__GlobalOutputPort__Group__2__Impl : ( () ) ;
    public final void rule__GlobalOutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1777:1: ( ( () ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1778:1: ( () )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1778:1: ( () )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1779:1: ()
            {
             before(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1780:1: ()
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1782:1: 
            {
            }

             after(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalOutputPort__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1798:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1802:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1803:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03638);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03641);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1810:1: rule__Port__Group__0__Impl : ( ( rule__Port__FunctionUnitAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1814:1: ( ( ( rule__Port__FunctionUnitAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1815:1: ( ( rule__Port__FunctionUnitAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1815:1: ( ( rule__Port__FunctionUnitAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1816:1: ( rule__Port__FunctionUnitAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1817:1: ( rule__Port__FunctionUnitAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1817:2: rule__Port__FunctionUnitAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__FunctionUnitAssignment_0_in_rule__Port__Group__0__Impl3668);
            rule__Port__FunctionUnitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1827:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1831:1: ( rule__Port__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1832:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13698);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1838:1: rule__Port__Group__1__Impl : ( ( rule__Port__PortAssignment_1 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1842:1: ( ( ( rule__Port__PortAssignment_1 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1843:1: ( ( rule__Port__PortAssignment_1 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1843:1: ( ( rule__Port__PortAssignment_1 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1844:1: ( rule__Port__PortAssignment_1 )?
            {
             before(grammarAccess.getPortAccess().getPortAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1845:1: ( rule__Port__PortAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1845:2: rule__Port__PortAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Port__PortAssignment_1_in_rule__Port__Group__1__Impl3725);
                    rule__Port__PortAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__NamedPort__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1859:1: rule__NamedPort__Group__0 : rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1 ;
    public final void rule__NamedPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1863:1: ( rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1864:2: rule__NamedPort__Group__0__Impl rule__NamedPort__Group__1
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__0__Impl_in_rule__NamedPort__Group__03760);
            rule__NamedPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedPort__Group__1_in_rule__NamedPort__Group__03763);
            rule__NamedPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__0"


    // $ANTLR start "rule__NamedPort__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1871:1: rule__NamedPort__Group__0__Impl : ( '.' ) ;
    public final void rule__NamedPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1875:1: ( ( '.' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1876:1: ( '.' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1876:1: ( '.' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1877:1: '.'
            {
             before(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__NamedPort__Group__0__Impl3791); 
             after(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__0__Impl"


    // $ANTLR start "rule__NamedPort__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1890:1: rule__NamedPort__Group__1 : rule__NamedPort__Group__1__Impl ;
    public final void rule__NamedPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1894:1: ( rule__NamedPort__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1895:2: rule__NamedPort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedPort__Group__1__Impl_in_rule__NamedPort__Group__13822);
            rule__NamedPort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__1"


    // $ANTLR start "rule__NamedPort__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1901:1: rule__NamedPort__Group__1__Impl : ( ( rule__NamedPort__NameAssignment_1 ) ) ;
    public final void rule__NamedPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1905:1: ( ( ( rule__NamedPort__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1906:1: ( ( rule__NamedPort__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1906:1: ( ( rule__NamedPort__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1907:1: ( rule__NamedPort__NameAssignment_1 )
            {
             before(grammarAccess.getNamedPortAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1908:1: ( rule__NamedPort__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1908:2: rule__NamedPort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedPort__NameAssignment_1_in_rule__NamedPort__Group__1__Impl3849);
            rule__NamedPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__Group__1__Impl"


    // $ANTLR start "rule__EbcOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1922:1: rule__EbcOperation__Group__0 : rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1 ;
    public final void rule__EbcOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1926:1: ( rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1927:2: rule__EbcOperation__Group__0__Impl rule__EbcOperation__Group__1
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__0__Impl_in_rule__EbcOperation__Group__03883);
            rule__EbcOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__1_in_rule__EbcOperation__Group__03886);
            rule__EbcOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__0"


    // $ANTLR start "rule__EbcOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1934:1: rule__EbcOperation__Group__0__Impl : ( 'ebc' ) ;
    public final void rule__EbcOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1938:1: ( ( 'ebc' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1939:1: ( 'ebc' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1939:1: ( 'ebc' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1940:1: 'ebc'
            {
             before(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__EbcOperation__Group__0__Impl3914); 
             after(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__0__Impl"


    // $ANTLR start "rule__EbcOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1953:1: rule__EbcOperation__Group__1 : rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2 ;
    public final void rule__EbcOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1957:1: ( rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1958:2: rule__EbcOperation__Group__1__Impl rule__EbcOperation__Group__2
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__1__Impl_in_rule__EbcOperation__Group__13945);
            rule__EbcOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__2_in_rule__EbcOperation__Group__13948);
            rule__EbcOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__1"


    // $ANTLR start "rule__EbcOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1965:1: rule__EbcOperation__Group__1__Impl : ( ( rule__EbcOperation__NameAssignment_1 ) ) ;
    public final void rule__EbcOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1969:1: ( ( ( rule__EbcOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1970:1: ( ( rule__EbcOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1970:1: ( ( rule__EbcOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1971:1: ( rule__EbcOperation__NameAssignment_1 )
            {
             before(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1972:1: ( rule__EbcOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1972:2: rule__EbcOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EbcOperation__NameAssignment_1_in_rule__EbcOperation__Group__1__Impl3975);
            rule__EbcOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__1__Impl"


    // $ANTLR start "rule__EbcOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1982:1: rule__EbcOperation__Group__2 : rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3 ;
    public final void rule__EbcOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1986:1: ( rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1987:2: rule__EbcOperation__Group__2__Impl rule__EbcOperation__Group__3
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__2__Impl_in_rule__EbcOperation__Group__24005);
            rule__EbcOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EbcOperation__Group__3_in_rule__EbcOperation__Group__24008);
            rule__EbcOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__2"


    // $ANTLR start "rule__EbcOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1994:1: rule__EbcOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__EbcOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1998:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1999:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:1999:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2000:1: '='
            {
             before(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__EbcOperation__Group__2__Impl4036); 
             after(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__2__Impl"


    // $ANTLR start "rule__EbcOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2013:1: rule__EbcOperation__Group__3 : rule__EbcOperation__Group__3__Impl ;
    public final void rule__EbcOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2017:1: ( rule__EbcOperation__Group__3__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2018:2: rule__EbcOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EbcOperation__Group__3__Impl_in_rule__EbcOperation__Group__34067);
            rule__EbcOperation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__3"


    // $ANTLR start "rule__EbcOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2024:1: rule__EbcOperation__Group__3__Impl : ( ( rule__EbcOperation__ClassAssignment_3 ) ) ;
    public final void rule__EbcOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2028:1: ( ( ( rule__EbcOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2029:1: ( ( rule__EbcOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2029:1: ( ( rule__EbcOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2030:1: ( rule__EbcOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2031:1: ( rule__EbcOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2031:2: rule__EbcOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__EbcOperation__ClassAssignment_3_in_rule__EbcOperation__Group__3__Impl4094);
            rule__EbcOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__Group__3__Impl"


    // $ANTLR start "rule__MethodOperation__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2049:1: rule__MethodOperation__Group__0 : rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1 ;
    public final void rule__MethodOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2053:1: ( rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2054:2: rule__MethodOperation__Group__0__Impl rule__MethodOperation__Group__1
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__0__Impl_in_rule__MethodOperation__Group__04132);
            rule__MethodOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__1_in_rule__MethodOperation__Group__04135);
            rule__MethodOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__0"


    // $ANTLR start "rule__MethodOperation__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2061:1: rule__MethodOperation__Group__0__Impl : ( 'method' ) ;
    public final void rule__MethodOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2065:1: ( ( 'method' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2066:1: ( 'method' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2066:1: ( 'method' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2067:1: 'method'
            {
             before(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__MethodOperation__Group__0__Impl4163); 
             after(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__0__Impl"


    // $ANTLR start "rule__MethodOperation__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2080:1: rule__MethodOperation__Group__1 : rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2 ;
    public final void rule__MethodOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2084:1: ( rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2085:2: rule__MethodOperation__Group__1__Impl rule__MethodOperation__Group__2
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__1__Impl_in_rule__MethodOperation__Group__14194);
            rule__MethodOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__2_in_rule__MethodOperation__Group__14197);
            rule__MethodOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__1"


    // $ANTLR start "rule__MethodOperation__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2092:1: rule__MethodOperation__Group__1__Impl : ( ( rule__MethodOperation__NameAssignment_1 ) ) ;
    public final void rule__MethodOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2096:1: ( ( ( rule__MethodOperation__NameAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2097:1: ( ( rule__MethodOperation__NameAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2097:1: ( ( rule__MethodOperation__NameAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2098:1: ( rule__MethodOperation__NameAssignment_1 )
            {
             before(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2099:1: ( rule__MethodOperation__NameAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2099:2: rule__MethodOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodOperation__NameAssignment_1_in_rule__MethodOperation__Group__1__Impl4224);
            rule__MethodOperation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__1__Impl"


    // $ANTLR start "rule__MethodOperation__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2109:1: rule__MethodOperation__Group__2 : rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3 ;
    public final void rule__MethodOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2113:1: ( rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2114:2: rule__MethodOperation__Group__2__Impl rule__MethodOperation__Group__3
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__2__Impl_in_rule__MethodOperation__Group__24254);
            rule__MethodOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__3_in_rule__MethodOperation__Group__24257);
            rule__MethodOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__2"


    // $ANTLR start "rule__MethodOperation__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2121:1: rule__MethodOperation__Group__2__Impl : ( '=' ) ;
    public final void rule__MethodOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2125:1: ( ( '=' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2126:1: ( '=' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2126:1: ( '=' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2127:1: '='
            {
             before(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__MethodOperation__Group__2__Impl4285); 
             after(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__2__Impl"


    // $ANTLR start "rule__MethodOperation__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2140:1: rule__MethodOperation__Group__3 : rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4 ;
    public final void rule__MethodOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2144:1: ( rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2145:2: rule__MethodOperation__Group__3__Impl rule__MethodOperation__Group__4
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__3__Impl_in_rule__MethodOperation__Group__34316);
            rule__MethodOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__4_in_rule__MethodOperation__Group__34319);
            rule__MethodOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__3"


    // $ANTLR start "rule__MethodOperation__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2152:1: rule__MethodOperation__Group__3__Impl : ( ( rule__MethodOperation__ClassAssignment_3 ) ) ;
    public final void rule__MethodOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2156:1: ( ( ( rule__MethodOperation__ClassAssignment_3 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2157:1: ( ( rule__MethodOperation__ClassAssignment_3 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2157:1: ( ( rule__MethodOperation__ClassAssignment_3 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2158:1: ( rule__MethodOperation__ClassAssignment_3 )
            {
             before(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2159:1: ( rule__MethodOperation__ClassAssignment_3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2159:2: rule__MethodOperation__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__MethodOperation__ClassAssignment_3_in_rule__MethodOperation__Group__3__Impl4346);
            rule__MethodOperation__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__3__Impl"


    // $ANTLR start "rule__MethodOperation__Group__4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2169:1: rule__MethodOperation__Group__4 : rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5 ;
    public final void rule__MethodOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2173:1: ( rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2174:2: rule__MethodOperation__Group__4__Impl rule__MethodOperation__Group__5
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__4__Impl_in_rule__MethodOperation__Group__44376);
            rule__MethodOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__5_in_rule__MethodOperation__Group__44379);
            rule__MethodOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__4"


    // $ANTLR start "rule__MethodOperation__Group__4__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2181:1: rule__MethodOperation__Group__4__Impl : ( '#' ) ;
    public final void rule__MethodOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2185:1: ( ( '#' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2186:1: ( '#' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2186:1: ( '#' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2187:1: '#'
            {
             before(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__MethodOperation__Group__4__Impl4407); 
             after(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__4__Impl"


    // $ANTLR start "rule__MethodOperation__Group__5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2200:1: rule__MethodOperation__Group__5 : rule__MethodOperation__Group__5__Impl rule__MethodOperation__Group__6 ;
    public final void rule__MethodOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2204:1: ( rule__MethodOperation__Group__5__Impl rule__MethodOperation__Group__6 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2205:2: rule__MethodOperation__Group__5__Impl rule__MethodOperation__Group__6
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__5__Impl_in_rule__MethodOperation__Group__54438);
            rule__MethodOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodOperation__Group__6_in_rule__MethodOperation__Group__54441);
            rule__MethodOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__5"


    // $ANTLR start "rule__MethodOperation__Group__5__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2212:1: rule__MethodOperation__Group__5__Impl : ( ( rule__MethodOperation__MethodAssignment_5 ) ) ;
    public final void rule__MethodOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2216:1: ( ( ( rule__MethodOperation__MethodAssignment_5 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2217:1: ( ( rule__MethodOperation__MethodAssignment_5 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2217:1: ( ( rule__MethodOperation__MethodAssignment_5 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2218:1: ( rule__MethodOperation__MethodAssignment_5 )
            {
             before(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2219:1: ( rule__MethodOperation__MethodAssignment_5 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2219:2: rule__MethodOperation__MethodAssignment_5
            {
            pushFollow(FOLLOW_rule__MethodOperation__MethodAssignment_5_in_rule__MethodOperation__Group__5__Impl4468);
            rule__MethodOperation__MethodAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__5__Impl"


    // $ANTLR start "rule__MethodOperation__Group__6"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2229:1: rule__MethodOperation__Group__6 : rule__MethodOperation__Group__6__Impl ;
    public final void rule__MethodOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2233:1: ( rule__MethodOperation__Group__6__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2234:2: rule__MethodOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MethodOperation__Group__6__Impl_in_rule__MethodOperation__Group__64498);
            rule__MethodOperation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__6"


    // $ANTLR start "rule__MethodOperation__Group__6__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2240:1: rule__MethodOperation__Group__6__Impl : ( ( rule__MethodOperation__SignatureAssignment_6 ) ) ;
    public final void rule__MethodOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2244:1: ( ( ( rule__MethodOperation__SignatureAssignment_6 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2245:1: ( ( rule__MethodOperation__SignatureAssignment_6 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2245:1: ( ( rule__MethodOperation__SignatureAssignment_6 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2246:1: ( rule__MethodOperation__SignatureAssignment_6 )
            {
             before(grammarAccess.getMethodOperationAccess().getSignatureAssignment_6()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2247:1: ( rule__MethodOperation__SignatureAssignment_6 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2247:2: rule__MethodOperation__SignatureAssignment_6
            {
            pushFollow(FOLLOW_rule__MethodOperation__SignatureAssignment_6_in_rule__MethodOperation__Group__6__Impl4525);
            rule__MethodOperation__SignatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodOperationAccess().getSignatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2271:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2275:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2276:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__04569);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__04572);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2283:1: rule__Signature__Group__0__Impl : ( 'as' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2287:1: ( ( 'as' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2288:1: ( 'as' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2288:1: ( 'as' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2289:1: 'as'
            {
             before(grammarAccess.getSignatureAccess().getAsKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Signature__Group__0__Impl4600); 
             after(grammarAccess.getSignatureAccess().getAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2302:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2306:1: ( rule__Signature__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2307:2: rule__Signature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__14631);
            rule__Signature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2313:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__TypeAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2317:1: ( ( ( rule__Signature__TypeAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2318:1: ( ( rule__Signature__TypeAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2318:1: ( ( rule__Signature__TypeAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2319:1: ( rule__Signature__TypeAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2320:1: ( rule__Signature__TypeAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2320:2: rule__Signature__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Signature__TypeAssignment_1_in_rule__Signature__Group__1__Impl4658);
            rule__Signature__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__GenericType__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2334:1: rule__GenericType__Group__0 : rule__GenericType__Group__0__Impl rule__GenericType__Group__1 ;
    public final void rule__GenericType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2338:1: ( rule__GenericType__Group__0__Impl rule__GenericType__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2339:2: rule__GenericType__Group__0__Impl rule__GenericType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericType__Group__0__Impl_in_rule__GenericType__Group__04692);
            rule__GenericType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericType__Group__1_in_rule__GenericType__Group__04695);
            rule__GenericType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__0"


    // $ANTLR start "rule__GenericType__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2346:1: rule__GenericType__Group__0__Impl : ( ( rule__GenericType__OperationTypeAssignment_0 ) ) ;
    public final void rule__GenericType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2350:1: ( ( ( rule__GenericType__OperationTypeAssignment_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2351:1: ( ( rule__GenericType__OperationTypeAssignment_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2351:1: ( ( rule__GenericType__OperationTypeAssignment_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2352:1: ( rule__GenericType__OperationTypeAssignment_0 )
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeAssignment_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2353:1: ( rule__GenericType__OperationTypeAssignment_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2353:2: rule__GenericType__OperationTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericType__OperationTypeAssignment_0_in_rule__GenericType__Group__0__Impl4722);
            rule__GenericType__OperationTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericTypeAccess().getOperationTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__0__Impl"


    // $ANTLR start "rule__GenericType__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2363:1: rule__GenericType__Group__1 : rule__GenericType__Group__1__Impl ;
    public final void rule__GenericType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2367:1: ( rule__GenericType__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2368:2: rule__GenericType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericType__Group__1__Impl_in_rule__GenericType__Group__14752);
            rule__GenericType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__1"


    // $ANTLR start "rule__GenericType__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2374:1: rule__GenericType__Group__1__Impl : ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? ) ;
    public final void rule__GenericType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2378:1: ( ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2379:1: ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2379:1: ( ( rule__GenericType__OperationTypeParametersAssignment_1 )? )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2380:1: ( rule__GenericType__OperationTypeParametersAssignment_1 )?
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeParametersAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2381:1: ( rule__GenericType__OperationTypeParametersAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2381:2: rule__GenericType__OperationTypeParametersAssignment_1
                    {
                    pushFollow(FOLLOW_rule__GenericType__OperationTypeParametersAssignment_1_in_rule__GenericType__Group__1__Impl4779);
                    rule__GenericType__OperationTypeParametersAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGenericTypeAccess().getOperationTypeParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__Group__1__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2395:1: rule__OperationTypeParameters__Group__0 : rule__OperationTypeParameters__Group__0__Impl rule__OperationTypeParameters__Group__1 ;
    public final void rule__OperationTypeParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2399:1: ( rule__OperationTypeParameters__Group__0__Impl rule__OperationTypeParameters__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2400:2: rule__OperationTypeParameters__Group__0__Impl rule__OperationTypeParameters__Group__1
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__0__Impl_in_rule__OperationTypeParameters__Group__04814);
            rule__OperationTypeParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__1_in_rule__OperationTypeParameters__Group__04817);
            rule__OperationTypeParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__0"


    // $ANTLR start "rule__OperationTypeParameters__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2407:1: rule__OperationTypeParameters__Group__0__Impl : ( '<' ) ;
    public final void rule__OperationTypeParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2411:1: ( ( '<' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2412:1: ( '<' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2412:1: ( '<' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2413:1: '<'
            {
             before(grammarAccess.getOperationTypeParametersAccess().getLessThanSignKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__OperationTypeParameters__Group__0__Impl4845); 
             after(grammarAccess.getOperationTypeParametersAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__0__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2426:1: rule__OperationTypeParameters__Group__1 : rule__OperationTypeParameters__Group__1__Impl rule__OperationTypeParameters__Group__2 ;
    public final void rule__OperationTypeParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2430:1: ( rule__OperationTypeParameters__Group__1__Impl rule__OperationTypeParameters__Group__2 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2431:2: rule__OperationTypeParameters__Group__1__Impl rule__OperationTypeParameters__Group__2
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__1__Impl_in_rule__OperationTypeParameters__Group__14876);
            rule__OperationTypeParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__2_in_rule__OperationTypeParameters__Group__14879);
            rule__OperationTypeParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__1"


    // $ANTLR start "rule__OperationTypeParameters__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2438:1: rule__OperationTypeParameters__Group__1__Impl : ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) ) ;
    public final void rule__OperationTypeParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2442:1: ( ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2443:1: ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2443:1: ( ( rule__OperationTypeParameters__TypeParameterAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2444:1: ( rule__OperationTypeParameters__TypeParameterAssignment_1 )
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParameterAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2445:1: ( rule__OperationTypeParameters__TypeParameterAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2445:2: rule__OperationTypeParameters__TypeParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__TypeParameterAssignment_1_in_rule__OperationTypeParameters__Group__1__Impl4906);
            rule__OperationTypeParameters__TypeParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__1__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2455:1: rule__OperationTypeParameters__Group__2 : rule__OperationTypeParameters__Group__2__Impl rule__OperationTypeParameters__Group__3 ;
    public final void rule__OperationTypeParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2459:1: ( rule__OperationTypeParameters__Group__2__Impl rule__OperationTypeParameters__Group__3 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2460:2: rule__OperationTypeParameters__Group__2__Impl rule__OperationTypeParameters__Group__3
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__2__Impl_in_rule__OperationTypeParameters__Group__24936);
            rule__OperationTypeParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__3_in_rule__OperationTypeParameters__Group__24939);
            rule__OperationTypeParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__2"


    // $ANTLR start "rule__OperationTypeParameters__Group__2__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2467:1: rule__OperationTypeParameters__Group__2__Impl : ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* ) ;
    public final void rule__OperationTypeParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2471:1: ( ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2472:1: ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2472:1: ( ( rule__OperationTypeParameters__TypeParametersAssignment_2 )* )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2473:1: ( rule__OperationTypeParameters__TypeParametersAssignment_2 )*
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParametersAssignment_2()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2474:1: ( rule__OperationTypeParameters__TypeParametersAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2474:2: rule__OperationTypeParameters__TypeParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__OperationTypeParameters__TypeParametersAssignment_2_in_rule__OperationTypeParameters__Group__2__Impl4966);
            	    rule__OperationTypeParameters__TypeParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__2__Impl"


    // $ANTLR start "rule__OperationTypeParameters__Group__3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2484:1: rule__OperationTypeParameters__Group__3 : rule__OperationTypeParameters__Group__3__Impl ;
    public final void rule__OperationTypeParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2488:1: ( rule__OperationTypeParameters__Group__3__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2489:2: rule__OperationTypeParameters__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OperationTypeParameters__Group__3__Impl_in_rule__OperationTypeParameters__Group__34997);
            rule__OperationTypeParameters__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__3"


    // $ANTLR start "rule__OperationTypeParameters__Group__3__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2495:1: rule__OperationTypeParameters__Group__3__Impl : ( '>' ) ;
    public final void rule__OperationTypeParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2499:1: ( ( '>' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2500:1: ( '>' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2500:1: ( '>' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2501:1: '>'
            {
             before(grammarAccess.getOperationTypeParametersAccess().getGreaterThanSignKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__OperationTypeParameters__Group__3__Impl5025); 
             after(grammarAccess.getOperationTypeParametersAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__Group__3__Impl"


    // $ANTLR start "rule__CSTypeParameter__Group__0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2522:1: rule__CSTypeParameter__Group__0 : rule__CSTypeParameter__Group__0__Impl rule__CSTypeParameter__Group__1 ;
    public final void rule__CSTypeParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2526:1: ( rule__CSTypeParameter__Group__0__Impl rule__CSTypeParameter__Group__1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2527:2: rule__CSTypeParameter__Group__0__Impl rule__CSTypeParameter__Group__1
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__Group__0__Impl_in_rule__CSTypeParameter__Group__05064);
            rule__CSTypeParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CSTypeParameter__Group__1_in_rule__CSTypeParameter__Group__05067);
            rule__CSTypeParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__0"


    // $ANTLR start "rule__CSTypeParameter__Group__0__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2534:1: rule__CSTypeParameter__Group__0__Impl : ( ',' ) ;
    public final void rule__CSTypeParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2538:1: ( ( ',' ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2539:1: ( ',' )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2539:1: ( ',' )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2540:1: ','
            {
             before(grammarAccess.getCSTypeParameterAccess().getCommaKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__CSTypeParameter__Group__0__Impl5095); 
             after(grammarAccess.getCSTypeParameterAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__0__Impl"


    // $ANTLR start "rule__CSTypeParameter__Group__1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2553:1: rule__CSTypeParameter__Group__1 : rule__CSTypeParameter__Group__1__Impl ;
    public final void rule__CSTypeParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2557:1: ( rule__CSTypeParameter__Group__1__Impl )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2558:2: rule__CSTypeParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__Group__1__Impl_in_rule__CSTypeParameter__Group__15126);
            rule__CSTypeParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__1"


    // $ANTLR start "rule__CSTypeParameter__Group__1__Impl"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2564:1: rule__CSTypeParameter__Group__1__Impl : ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) ) ;
    public final void rule__CSTypeParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2568:1: ( ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2569:1: ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2569:1: ( ( rule__CSTypeParameter__TypeParameterAssignment_1 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2570:1: ( rule__CSTypeParameter__TypeParameterAssignment_1 )
            {
             before(grammarAccess.getCSTypeParameterAccess().getTypeParameterAssignment_1()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2571:1: ( rule__CSTypeParameter__TypeParameterAssignment_1 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2571:2: rule__CSTypeParameter__TypeParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__CSTypeParameter__TypeParameterAssignment_1_in_rule__CSTypeParameter__Group__1__Impl5153);
            rule__CSTypeParameter__TypeParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSTypeParameterAccess().getTypeParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__Group__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_0_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2586:1: rule__Model__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2590:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2591:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2591:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2592:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_15192);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_0_1"


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2601:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2605:1: ( ( ruleImport ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2606:1: ( ruleImport )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2606:1: ( ruleImport )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2607:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_15223);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__FunctionUnitsAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2616:1: rule__Model__FunctionUnitsAssignment_2 : ( ruleFunctionUnit ) ;
    public final void rule__Model__FunctionUnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2620:1: ( ( ruleFunctionUnit ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2621:1: ( ruleFunctionUnit )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2621:1: ( ruleFunctionUnit )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2622:1: ruleFunctionUnit
            {
             before(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFunctionUnit_in_rule__Model__FunctionUnitsAssignment_25254);
            ruleFunctionUnit();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FunctionUnitsAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2631:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2635:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2636:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2636:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2637:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_15285);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Flow__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2646:1: rule__Flow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2650:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2651:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2651:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2652:1: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_15316); 
             after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__NameAssignment_1"


    // $ANTLR start "rule__Flow__StreamsAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2661:1: rule__Flow__StreamsAssignment_2 : ( ruleStream ) ;
    public final void rule__Flow__StreamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2665:1: ( ( ruleStream ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2666:1: ( ruleStream )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2666:1: ( ruleStream )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2667:1: ruleStream
            {
             before(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStream_in_rule__Flow__StreamsAssignment_25347);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__StreamsAssignment_2"


    // $ANTLR start "rule__Stream__LeftPortAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2676:1: rule__Stream__LeftPortAssignment_0 : ( ruleLeftPort ) ;
    public final void rule__Stream__LeftPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2680:1: ( ( ruleLeftPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2681:1: ( ruleLeftPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2681:1: ( ruleLeftPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2682:1: ruleLeftPort
            {
             before(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeftPort_in_rule__Stream__LeftPortAssignment_05378);
            ruleLeftPort();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__LeftPortAssignment_0"


    // $ANTLR start "rule__Stream__MessageAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2691:1: rule__Stream__MessageAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Stream__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2695:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2696:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2696:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2697:1: ruleQualifiedName
            {
             before(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Stream__MessageAssignment_25409);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__MessageAssignment_2"


    // $ANTLR start "rule__Stream__RightPortAssignment_4"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2706:1: rule__Stream__RightPortAssignment_4 : ( ruleRightPort ) ;
    public final void rule__Stream__RightPortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2710:1: ( ( ruleRightPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2711:1: ( ruleRightPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2711:1: ( ruleRightPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2712:1: ruleRightPort
            {
             before(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRightPort_in_rule__Stream__RightPortAssignment_45440);
            ruleRightPort();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__RightPortAssignment_4"


    // $ANTLR start "rule__Port__FunctionUnitAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2721:1: rule__Port__FunctionUnitAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Port__FunctionUnitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2725:1: ( ( ( RULE_ID ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2726:1: ( ( RULE_ID ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2726:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2727:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2728:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2729:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__FunctionUnitAssignment_05475); 
             after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__FunctionUnitAssignment_0"


    // $ANTLR start "rule__Port__PortAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2740:1: rule__Port__PortAssignment_1 : ( ruleNamedPort ) ;
    public final void rule__Port__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2744:1: ( ( ruleNamedPort ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2745:1: ( ruleNamedPort )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2745:1: ( ruleNamedPort )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2746:1: ruleNamedPort
            {
             before(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNamedPort_in_rule__Port__PortAssignment_15510);
            ruleNamedPort();

            state._fsp--;

             after(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__PortAssignment_1"


    // $ANTLR start "rule__NamedPort__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2755:1: rule__NamedPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2759:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2760:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2760:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2761:1: RULE_ID
            {
             before(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedPort__NameAssignment_15541); 
             after(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedPort__NameAssignment_1"


    // $ANTLR start "rule__EbcOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2770:1: rule__EbcOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EbcOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2774:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2775:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2775:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2776:1: RULE_ID
            {
             before(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EbcOperation__NameAssignment_15572); 
             after(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__NameAssignment_1"


    // $ANTLR start "rule__EbcOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2785:1: rule__EbcOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__EbcOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2789:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2790:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2790:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2791:1: ruleNativeClass
            {
             before(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__EbcOperation__ClassAssignment_35603);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbcOperation__ClassAssignment_3"


    // $ANTLR start "rule__NativeClass__ReferenceAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2800:1: rule__NativeClass__ReferenceAssignment : ( ruleQualifiedName ) ;
    public final void rule__NativeClass__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2804:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2805:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2805:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2806:1: ruleQualifiedName
            {
             before(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NativeClass__ReferenceAssignment5634);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeClass__ReferenceAssignment"


    // $ANTLR start "rule__MethodOperation__NameAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2815:1: rule__MethodOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2819:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2820:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2820:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2821:1: RULE_ID
            {
             before(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodOperation__NameAssignment_15665); 
             after(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__NameAssignment_1"


    // $ANTLR start "rule__MethodOperation__ClassAssignment_3"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2830:1: rule__MethodOperation__ClassAssignment_3 : ( ruleNativeClass ) ;
    public final void rule__MethodOperation__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2834:1: ( ( ruleNativeClass ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2835:1: ( ruleNativeClass )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2835:1: ( ruleNativeClass )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2836:1: ruleNativeClass
            {
             before(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNativeClass_in_rule__MethodOperation__ClassAssignment_35696);
            ruleNativeClass();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__ClassAssignment_3"


    // $ANTLR start "rule__MethodOperation__MethodAssignment_5"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2845:1: rule__MethodOperation__MethodAssignment_5 : ( ruleNativeMethod ) ;
    public final void rule__MethodOperation__MethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2849:1: ( ( ruleNativeMethod ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2850:1: ( ruleNativeMethod )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2850:1: ( ruleNativeMethod )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2851:1: ruleNativeMethod
            {
             before(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNativeMethod_in_rule__MethodOperation__MethodAssignment_55727);
            ruleNativeMethod();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__MethodAssignment_5"


    // $ANTLR start "rule__MethodOperation__SignatureAssignment_6"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2860:1: rule__MethodOperation__SignatureAssignment_6 : ( ruleSignature ) ;
    public final void rule__MethodOperation__SignatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2864:1: ( ( ruleSignature ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2865:1: ( ruleSignature )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2865:1: ( ruleSignature )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2866:1: ruleSignature
            {
             before(grammarAccess.getMethodOperationAccess().getSignatureSignatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSignature_in_rule__MethodOperation__SignatureAssignment_65758);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getMethodOperationAccess().getSignatureSignatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodOperation__SignatureAssignment_6"


    // $ANTLR start "rule__Signature__TypeAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2875:1: rule__Signature__TypeAssignment_1 : ( ruleGenericType ) ;
    public final void rule__Signature__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2879:1: ( ( ruleGenericType ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2880:1: ( ruleGenericType )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2880:1: ( ruleGenericType )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2881:1: ruleGenericType
            {
             before(grammarAccess.getSignatureAccess().getTypeGenericTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGenericType_in_rule__Signature__TypeAssignment_15789);
            ruleGenericType();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getTypeGenericTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__TypeAssignment_1"


    // $ANTLR start "rule__GenericType__OperationTypeAssignment_0"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2890:1: rule__GenericType__OperationTypeAssignment_0 : ( ruleOperationType ) ;
    public final void rule__GenericType__OperationTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2894:1: ( ( ruleOperationType ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2895:1: ( ruleOperationType )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2895:1: ( ruleOperationType )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2896:1: ruleOperationType
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeOperationTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOperationType_in_rule__GenericType__OperationTypeAssignment_05820);
            ruleOperationType();

            state._fsp--;

             after(grammarAccess.getGenericTypeAccess().getOperationTypeOperationTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__OperationTypeAssignment_0"


    // $ANTLR start "rule__GenericType__OperationTypeParametersAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2905:1: rule__GenericType__OperationTypeParametersAssignment_1 : ( ruleOperationTypeParameters ) ;
    public final void rule__GenericType__OperationTypeParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2909:1: ( ( ruleOperationTypeParameters ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2910:1: ( ruleOperationTypeParameters )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2910:1: ( ruleOperationTypeParameters )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2911:1: ruleOperationTypeParameters
            {
             before(grammarAccess.getGenericTypeAccess().getOperationTypeParametersOperationTypeParametersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOperationTypeParameters_in_rule__GenericType__OperationTypeParametersAssignment_15851);
            ruleOperationTypeParameters();

            state._fsp--;

             after(grammarAccess.getGenericTypeAccess().getOperationTypeParametersOperationTypeParametersParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericType__OperationTypeParametersAssignment_1"


    // $ANTLR start "rule__OperationType__NameAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2920:1: rule__OperationType__NameAssignment : ( ( rule__OperationType__NameAlternatives_0 ) ) ;
    public final void rule__OperationType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2924:1: ( ( ( rule__OperationType__NameAlternatives_0 ) ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2925:1: ( ( rule__OperationType__NameAlternatives_0 ) )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2925:1: ( ( rule__OperationType__NameAlternatives_0 ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2926:1: ( rule__OperationType__NameAlternatives_0 )
            {
             before(grammarAccess.getOperationTypeAccess().getNameAlternatives_0()); 
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2927:1: ( rule__OperationType__NameAlternatives_0 )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2927:2: rule__OperationType__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__OperationType__NameAlternatives_0_in_rule__OperationType__NameAssignment5882);
            rule__OperationType__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationTypeAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationType__NameAssignment"


    // $ANTLR start "rule__OperationTypeParameters__TypeParameterAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2936:1: rule__OperationTypeParameters__TypeParameterAssignment_1 : ( ruleTypeParameter ) ;
    public final void rule__OperationTypeParameters__TypeParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2940:1: ( ( ruleTypeParameter ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2941:1: ( ruleTypeParameter )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2941:1: ( ruleTypeParameter )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2942:1: ruleTypeParameter
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_rule__OperationTypeParameters__TypeParameterAssignment_15915);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__TypeParameterAssignment_1"


    // $ANTLR start "rule__OperationTypeParameters__TypeParametersAssignment_2"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2951:1: rule__OperationTypeParameters__TypeParametersAssignment_2 : ( ruleCSTypeParameter ) ;
    public final void rule__OperationTypeParameters__TypeParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2955:1: ( ( ruleCSTypeParameter ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2956:1: ( ruleCSTypeParameter )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2956:1: ( ruleCSTypeParameter )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2957:1: ruleCSTypeParameter
            {
             before(grammarAccess.getOperationTypeParametersAccess().getTypeParametersCSTypeParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCSTypeParameter_in_rule__OperationTypeParameters__TypeParametersAssignment_25946);
            ruleCSTypeParameter();

            state._fsp--;

             after(grammarAccess.getOperationTypeParametersAccess().getTypeParametersCSTypeParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationTypeParameters__TypeParametersAssignment_2"


    // $ANTLR start "rule__CSTypeParameter__TypeParameterAssignment_1"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2966:1: rule__CSTypeParameter__TypeParameterAssignment_1 : ( ruleTypeParameter ) ;
    public final void rule__CSTypeParameter__TypeParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2970:1: ( ( ruleTypeParameter ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2971:1: ( ruleTypeParameter )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2971:1: ( ruleTypeParameter )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2972:1: ruleTypeParameter
            {
             before(grammarAccess.getCSTypeParameterAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_rule__CSTypeParameter__TypeParameterAssignment_15977);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getCSTypeParameterAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSTypeParameter__TypeParameterAssignment_1"


    // $ANTLR start "rule__Type__ReferenceAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2981:1: rule__Type__ReferenceAssignment : ( ruleQualifiedName ) ;
    public final void rule__Type__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2985:1: ( ( ruleQualifiedName ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2986:1: ( ruleQualifiedName )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2986:1: ( ruleQualifiedName )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2987:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeAccess().getReferenceQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Type__ReferenceAssignment6008);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getReferenceQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ReferenceAssignment"


    // $ANTLR start "rule__NativeMethod__NameAssignment"
    // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:2996:1: rule__NativeMethod__NameAssignment : ( RULE_ID ) ;
    public final void rule__NativeMethod__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3000:1: ( ( RULE_ID ) )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3001:1: ( RULE_ID )
            {
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3001:1: ( RULE_ID )
            // ../de.grammarcraft.csflow.ui/src-gen/de/grammarcraft/csflow/ui/contentassist/antlr/internal/InternalFlow.g:3002:1: RULE_ID
            {
             before(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NativeMethod__NameAssignment6039); 
             after(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeMethod__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_entryRuleFunctionUnit181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionUnit188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionUnit__Alternatives_in_ruleFunctionUnit214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_entryRuleStream361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStream368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__0_in_ruleStream394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_entryRuleLeftPort421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftPort428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LeftPort__Alternatives_in_ruleLeftPort454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_entryRuleGlobalInputPort481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInputPort488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__0_in_ruleGlobalInputPort514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_entryRuleUnnamedSubFlowPort541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedSubFlowPort548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__0_in_ruleUnnamedSubFlowPort574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_entryRuleRightPort601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightPort608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RightPort__Alternatives_in_ruleRightPort634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_entryRuleGlobalOutputPort661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalOutputPort668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__0_in_ruleGlobalOutputPort694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_entryRuleNamedPort781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPort788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__0_in_ruleNamedPort814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_entryRuleEbcOperation901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEbcOperation908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__0_in_ruleEbcOperation934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_entryRuleNativeClass961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeClass968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeClass__ReferenceAssignment_in_ruleNativeClass994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_entryRuleMethodOperation1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodOperation1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__0_in_ruleMethodOperation1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignature1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__Group__0_in_ruleSignature1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_entryRuleGenericType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__Group__0_in_ruleGenericType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationType_in_entryRuleOperationType1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationType__NameAssignment_in_ruleOperationType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationTypeParameters_in_entryRuleOperationTypeParameters1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationTypeParameters1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__0_in_ruleOperationTypeParameters1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSTypeParameter_in_entryRuleCSTypeParameter1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSTypeParameter1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__0_in_ruleCSTypeParameter1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ReferenceAssignment_in_ruleType1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_entryRuleNativeMethod1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeMethod1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeMethod__NameAssignment_in_ruleNativeMethod1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__FunctionUnit__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__FunctionUnit__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInputPort_in_rule__LeftPort__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_rule__LeftPort__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__LeftPort__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalOutputPort_in_rule__RightPort__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedSubFlowPort_in_rule__RightPort__Alternatives1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__RightPort__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEbcOperation_in_rule__Operation__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodOperation_in_rule__Operation__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OperationType__NameAlternatives_01801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OperationType__NameAlternatives_01821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_rule__TypeParameter__Alternatives1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeParameter__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01902 = new BitSet(new long[]{0x0000000000A18000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11963 = new BitSet(new long[]{0x0000000000A18000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Group__1__Impl1993 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionUnitsAssignment_2_in_rule__Model__Group__2__Impl2051 = new BitSet(new long[]{0x0000000000A10002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__02088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__02091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_0__0__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__12150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02211 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2297 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Flow__Group__0__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12639 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StreamsAssignment_2_in_rule__Flow__Group__2__Impl2726 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rule__Stream__Group__0__Impl_in_rule__Stream__Group__02763 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Stream__Group__1_in_rule__Stream__Group__02766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__LeftPortAssignment_0_in_rule__Stream__Group__0__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__1__Impl_in_rule__Stream__Group__12823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stream__Group__2_in_rule__Stream__Group__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Stream__Group__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__2__Impl_in_rule__Stream__Group__22885 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Stream__Group__3_in_rule__Stream__Group__22888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__MessageAssignment_2_in_rule__Stream__Group__2__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__3__Impl_in_rule__Stream__Group__32945 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Stream__Group__4_in_rule__Stream__Group__32948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Stream__Group__3__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__4__Impl_in_rule__Stream__Group__43007 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Stream__Group__5_in_rule__Stream__Group__43010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__RightPortAssignment_4_in_rule__Stream__Group__4__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stream__Group__5__Impl_in_rule__Stream__Group__53067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Stream__Group__5__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__0__Impl_in_rule__GlobalInputPort__Group__03138 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__1_in_rule__GlobalInputPort__Group__03141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GlobalInputPort__Group__0__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__1__Impl_in_rule__GlobalInputPort__Group__13200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__2_in_rule__GlobalInputPort__Group__13203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GlobalInputPort__Group__1__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInputPort__Group__2__Impl_in_rule__GlobalInputPort__Group__23262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__0__Impl_in_rule__UnnamedSubFlowPort__Group__03326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__1_in_rule__UnnamedSubFlowPort__Group__03329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnnamedSubFlowPort__Group__0__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedSubFlowPort__Group__1__Impl_in_rule__UnnamedSubFlowPort__Group__13388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__0__Impl_in_rule__GlobalOutputPort__Group__03450 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__1_in_rule__GlobalOutputPort__Group__03453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GlobalOutputPort__Group__0__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__1__Impl_in_rule__GlobalOutputPort__Group__13512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__2_in_rule__GlobalOutputPort__Group__13515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GlobalOutputPort__Group__1__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalOutputPort__Group__2__Impl_in_rule__GlobalOutputPort__Group__23574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03638 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__FunctionUnitAssignment_0_in_rule__Port__Group__0__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__PortAssignment_1_in_rule__Port__Group__1__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__0__Impl_in_rule__NamedPort__Group__03760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__1_in_rule__NamedPort__Group__03763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamedPort__Group__0__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__Group__1__Impl_in_rule__NamedPort__Group__13822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedPort__NameAssignment_1_in_rule__NamedPort__Group__1__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__0__Impl_in_rule__EbcOperation__Group__03883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__1_in_rule__EbcOperation__Group__03886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EbcOperation__Group__0__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__1__Impl_in_rule__EbcOperation__Group__13945 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__2_in_rule__EbcOperation__Group__13948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__NameAssignment_1_in_rule__EbcOperation__Group__1__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__2__Impl_in_rule__EbcOperation__Group__24005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__3_in_rule__EbcOperation__Group__24008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EbcOperation__Group__2__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__Group__3__Impl_in_rule__EbcOperation__Group__34067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EbcOperation__ClassAssignment_3_in_rule__EbcOperation__Group__3__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__0__Impl_in_rule__MethodOperation__Group__04132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__1_in_rule__MethodOperation__Group__04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MethodOperation__Group__0__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__1__Impl_in_rule__MethodOperation__Group__14194 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__2_in_rule__MethodOperation__Group__14197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__NameAssignment_1_in_rule__MethodOperation__Group__1__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__2__Impl_in_rule__MethodOperation__Group__24254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__3_in_rule__MethodOperation__Group__24257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MethodOperation__Group__2__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__3__Impl_in_rule__MethodOperation__Group__34316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__4_in_rule__MethodOperation__Group__34319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__ClassAssignment_3_in_rule__MethodOperation__Group__3__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__4__Impl_in_rule__MethodOperation__Group__44376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__5_in_rule__MethodOperation__Group__44379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MethodOperation__Group__4__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__5__Impl_in_rule__MethodOperation__Group__54438 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__6_in_rule__MethodOperation__Group__54441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__MethodAssignment_5_in_rule__MethodOperation__Group__5__Impl4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__Group__6__Impl_in_rule__MethodOperation__Group__64498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodOperation__SignatureAssignment_6_in_rule__MethodOperation__Group__6__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__04569 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__04572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Signature__Group__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__14631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signature__TypeAssignment_1_in_rule__Signature__Group__1__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__Group__0__Impl_in_rule__GenericType__Group__04692 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GenericType__Group__1_in_rule__GenericType__Group__04695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__OperationTypeAssignment_0_in_rule__GenericType__Group__0__Impl4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__Group__1__Impl_in_rule__GenericType__Group__14752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericType__OperationTypeParametersAssignment_1_in_rule__GenericType__Group__1__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__0__Impl_in_rule__OperationTypeParameters__Group__04814 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__1_in_rule__OperationTypeParameters__Group__04817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__OperationTypeParameters__Group__0__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__1__Impl_in_rule__OperationTypeParameters__Group__14876 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__2_in_rule__OperationTypeParameters__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__TypeParameterAssignment_1_in_rule__OperationTypeParameters__Group__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__2__Impl_in_rule__OperationTypeParameters__Group__24936 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__3_in_rule__OperationTypeParameters__Group__24939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__TypeParametersAssignment_2_in_rule__OperationTypeParameters__Group__2__Impl4966 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__OperationTypeParameters__Group__3__Impl_in_rule__OperationTypeParameters__Group__34997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OperationTypeParameters__Group__3__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__0__Impl_in_rule__CSTypeParameter__Group__05064 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__1_in_rule__CSTypeParameter__Group__05067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CSTypeParameter__Group__0__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__Group__1__Impl_in_rule__CSTypeParameter__Group__15126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSTypeParameter__TypeParameterAssignment_1_in_rule__CSTypeParameter__Group__1__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_15192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_15223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionUnit_in_rule__Model__FunctionUnitsAssignment_25254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_15285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_15316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStream_in_rule__Flow__StreamsAssignment_25347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftPort_in_rule__Stream__LeftPortAssignment_05378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Stream__MessageAssignment_25409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightPort_in_rule__Stream__RightPortAssignment_45440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__FunctionUnitAssignment_05475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPort_in_rule__Port__PortAssignment_15510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedPort__NameAssignment_15541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EbcOperation__NameAssignment_15572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__EbcOperation__ClassAssignment_35603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NativeClass__ReferenceAssignment5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodOperation__NameAssignment_15665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeClass_in_rule__MethodOperation__ClassAssignment_35696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeMethod_in_rule__MethodOperation__MethodAssignment_55727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_rule__MethodOperation__SignatureAssignment_65758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericType_in_rule__Signature__TypeAssignment_15789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationType_in_rule__GenericType__OperationTypeAssignment_05820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationTypeParameters_in_rule__GenericType__OperationTypeParametersAssignment_15851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationType__NameAlternatives_0_in_rule__OperationType__NameAssignment5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__OperationTypeParameters__TypeParameterAssignment_15915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSTypeParameter_in_rule__OperationTypeParameters__TypeParametersAssignment_25946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__CSTypeParameter__TypeParameterAssignment_15977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Type__ReferenceAssignment6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NativeMethod__NameAssignment6039 = new BitSet(new long[]{0x0000000000000002L});

}